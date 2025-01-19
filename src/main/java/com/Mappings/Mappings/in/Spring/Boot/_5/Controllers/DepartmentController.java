package com.Mappings.Mappings.in.Spring.Boot._5.Controllers;

import com.Mappings.Mappings.in.Spring.Boot._5.Entities.DepartmentEntity;
import com.Mappings.Mappings.in.Spring.Boot._5.Services.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController
{
private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService)
    {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}")
    public DepartmentEntity getDepartmentById(@PathVariable Long id)
    {
        return departmentService.getDepartmentById(id);
    }

    @PostMapping
    public DepartmentEntity createNewDepartment(@RequestBody DepartmentEntity departmentEntity)
    {
        return departmentService.createNewDepartment(departmentEntity);
    }

    @PutMapping("/{departmentId}/manager/{employeeId}")
    public DepartmentEntity assignManagerToDepartment(@PathVariable Long departmentId,
                                                      @PathVariable Long employeeId)
    {
        return departmentService.assignManagerToDepartment(departmentId,employeeId);
    }

}
