package com.example.springbbootfirst.Controllers;

import com.example.springbbootfirst.Models.Employee;
import com.example.springbbootfirst.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {
    //Service layer
    @Autowired
    private HelloWorldService hws;


    @PostMapping
    public String addEmployee(@RequestBody Employee e){
        return hws.addEmployee(e);
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return hws.getAllEmployees();
    }

    @GetMapping("/{eid}")
    public Employee getEmployeeById(@PathVariable int eid){
        return hws.getEmployeeById(eid);
    }

    @GetMapping("/job/{job}")
    public Employee getEmployeeByJob(@PathVariable String job){
        return hws.getEmployeeByJob(job);
    }

    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable int eid){
        return hws.deleteEmployeeById(eid);
    }

    @DeleteMapping
    public String deleteAllEmployee(){
        return hws.deleteAllEmployee();
    }

    @PutMapping("/{eid}")
    public String updateRecord(@RequestBody Employee employee){
        return hws.updateRecord(employee);
    }


}
