package com.Mappings.Mappings.in.Spring.Boot._5.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employees")
public class EmployeeEntity
{
    public  EmployeeEntity()
    {

    }

    public EmployeeEntity(Long id, String name, DepartmentEntity managedDepartment) {
        this.id = id;
        this.name = name;
        this.managedDepartment = managedDepartment;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentEntity getManagedDepartment() {
        return managedDepartment;
    }

    public void setManagedDepartment(DepartmentEntity managedDepartment) {
        this.managedDepartment = managedDepartment;
    }

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "manager")
    @JsonIgnore
    private DepartmentEntity managedDepartment;

    @ManyToOne
    @JoinColumn(name = "worker_department_id",referencedColumnName = "id")
    private DepartmentEntity workerDepartment;


}
