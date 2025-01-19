package com.Mappings.Mappings.in.Spring.Boot._5.Services;

import com.Mappings.Mappings.in.Spring.Boot._5.Entities.DepartmentEntity;
import com.Mappings.Mappings.in.Spring.Boot._5.Entities.EmployeeEntity;
import com.Mappings.Mappings.in.Spring.Boot._5.Repositories.DepartmentRepository;
import com.Mappings.Mappings.in.Spring.Boot._5.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService
{
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository)
    {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public DepartmentEntity createNewDepartment(DepartmentEntity departmentEntity)
    {
        return departmentRepository.save(departmentEntity);
    }
    public DepartmentEntity getDepartmentById(Long id)
    {
        return departmentRepository.findById(id).orElse(null);
    }

    public DepartmentEntity assignManagerToDepartment(Long departmentId, Long employeeId)
    {
        Optional<DepartmentEntity> departmentEntity=departmentRepository.findById(departmentId);
        Optional<EmployeeEntity> employeeEntity= employeeRepository.findById(employeeId);

        return departmentEntity.flatMap(department->
                employeeEntity.map(employee->{
                    department.setManager(employee);
                    return departmentRepository.save(department);
                })).orElse(null);

    }
}
