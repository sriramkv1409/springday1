package com.example.springbbootfirst.Controllers;

import com.example.springbbootfirst.Models.Employee;
import com.example.springbbootfirst.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/employee")
public class HelloWorldController {
    //Service layer
    @Autowired
    private HelloWorldService hws;


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee e){
        return hws.addEmployee(e);
    }


    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/")
    public String sample(){
        return "Welcome to SPRING-BOOT Security";
    }


    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return hws.getAllEmployees();
    }


    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/employee/{eid}")
    public Employee getEmployeeById(@PathVariable int eid){
        return hws.getEmployeeById(eid);
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/employee/job/{job}")
    public Employee getEmployeeByJob(@PathVariable String job){
        return hws.getEmployeeByJob(job);
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/employee/{eid}")
    public String deleteEmployee(@PathVariable int eid){
        return hws.deleteEmployeeById(eid);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/employee")
    public String deleteAllEmployee(){
        return hws.deleteAllEmployee();
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/employee/{eid}")
    public String updateRecord(@RequestBody Employee employee){
        return hws.updateRecord(employee);
    }


}
