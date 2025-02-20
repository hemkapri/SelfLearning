package com.learning.Learning.repo;

import com.learning.Learning.entity.EmployeesE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDataRepo extends JpaRepository<EmployeesE, Long> {

}
