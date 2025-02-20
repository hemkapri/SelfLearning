package com.learning.Learning.service;

import com.learning.Learning.entity.EmployeesE;
import com.learning.Learning.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learning.Learning.repo.EmployeeDataRepo;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDataRepo employeeDataRepo;

    public Optional<EmployeesE> getEmpData(long id){
       Optional<EmployeesE> data = employeeDataRepo.findById(id);
        return data;

    }
    public String saveEmpData(Employee e){
        EmployeesE obj = new EmployeesE();
        obj.setEmpName(e.getEmpName());
        obj.setEmpAddress(e.getEmpAddress());
        obj.setEmpMobileNo(e.getEmpMobileNo());
        EmployeesE entity = employeeDataRepo.save(obj);
        return "Save Employee Data Successfully, details = "+ entity;
    }

    public String deleteempData(long id){
        employeeDataRepo.deleteById(id);
        return "Delete Data Successfully" + id;
    }

    public String updateEmpData(Employee e){
        return "Update Data Successfully";
    }
}
