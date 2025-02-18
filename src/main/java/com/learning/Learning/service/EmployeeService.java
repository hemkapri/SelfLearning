package com.learning.Learning.service;

import com.learning.Learning.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmpData(long id){
        List<Employee> obj = new ArrayList<>();
        obj.add(new Employee(1,"Hem","Pithoragarh",7534868979L));
        obj.add(new Employee(2,"Mukesh","Pune",9599512623L));
        obj.add(new Employee(3,"Avyaan","Delhi",7534899999L));
        obj.add(new Employee(4,"Hridhaan","Mumbai",9534868979L));

        return obj;

    }
    public String saveEmpData(Employee e){
        return "Save Employee Data Successfully";
    }

    public String deleteempData(long id){
        return "Delete Data Successfully";
    }

    public String updateEmpData(Employee e){
        return "Update Data Successfully";
    }
}
