package com.Mappings.Mappings.in.Spring.Boot._5.Controllers;

import com.Mappings.Mappings.in.Spring.Boot._5.Entities.EmployeeEntity;
import com.Mappings.Mappings.in.Spring.Boot._5.Services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public EmployeeEntity getDepartmentByid(@PathVariable Long id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity)
    {
        return employeeService.createNewEmployee(employeeEntity);
    }

}
