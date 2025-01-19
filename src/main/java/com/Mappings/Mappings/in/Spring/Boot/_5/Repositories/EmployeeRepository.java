package com.Mappings.Mappings.in.Spring.Boot._5.Repositories;

import com.Mappings.Mappings.in.Spring.Boot._5.Entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>
{

}
