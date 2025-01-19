package com.Mappings.Mappings.in.Spring.Boot._5.Services;

import com.Mappings.Mappings.in.Spring.Boot._5.Entities.EmployeeEntity;
import com.Mappings.Mappings.in.Spring.Boot._5.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity)
    {
        return employeeRepository.save(employeeEntity);
    }
    public EmployeeEntity getEmployeeById(Long id)
    {
        return employeeRepository.findById(id).orElse(null);
    }

}
