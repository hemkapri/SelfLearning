package com.learning.Learning.controller;

import com.learning.Learning.entity.EmployeesE;
import com.learning.Learning.pojo.Employee;
import com.learning.Learning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//@RequestMapping("/data")
public class EmployeeController {

    @Autowired
    EmployeeService e;

    @RequestMapping(value = "/getData/{id}", method = RequestMethod.GET)
    //@GetMapping("/get")
    public Optional<EmployeesE> getEmpData(@PathVariable long id){
        return e.getEmpData(id);

    }
    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public String saveData(@RequestBody Employee emp){
        return e.saveEmpData(emp);
    }

    @RequestMapping(value = "/deleteData/{id}", method = RequestMethod.DELETE)
    public String deleteData(@PathVariable long id){

        return e.deleteempData(id);
    }

    @RequestMapping(value = "/updateData", method = RequestMethod.PUT)
    public String updateData(@RequestBody Employee em){
        return e.updateEmpData(em);
    }




}
