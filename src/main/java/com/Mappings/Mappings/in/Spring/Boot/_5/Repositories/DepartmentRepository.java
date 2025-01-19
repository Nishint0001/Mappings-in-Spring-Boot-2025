package com.Mappings.Mappings.in.Spring.Boot._5.Repositories;

import com.Mappings.Mappings.in.Spring.Boot._5.Entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long>
{
}
