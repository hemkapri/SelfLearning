package com.learning.Learning.repo;

import com.learning.Learning.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {


}
