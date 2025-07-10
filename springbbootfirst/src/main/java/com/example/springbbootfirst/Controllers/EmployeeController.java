package com.example.springbbootfirst.Controllers;

import com.example.springbbootfirst.Models.RegisterDetails;
import com.example.springbbootfirst.Models.UserDetailsDto;
import com.example.springbbootfirst.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {
    //Service layer
    @Autowired
    private EmployeeService employeeService;


    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/")
    public String sample(){
        return "Welcome to SPRING-BOOT Security";
    }


    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/employee")
    public List<RegisterDetails> getEmployees(){
        return employeeService.getAllEmployees();
    }


    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/employee/{empId}")
    public RegisterDetails getEmployeeById(@PathVariable int empId){
        return employeeService.getEmployeeById(empId);
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/employee/{empId}")
    public String deleteEmployeeById(@PathVariable int empId){
        return employeeService.deleteEmployeeById(empId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/employee")
    public String deleteAllEmployee(){
        return employeeService.deleteAllEmployee();
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/employee/{empId}")
    public String updateRecord(@RequestBody RegisterDetails employee){
        return employeeService.updateRecord(employee);
    }


}
