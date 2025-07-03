package com.example.springbbootfirst.Controllers;

import com.example.springbbootfirst.Models.Employee;
import com.example.springbbootfirst.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {
    //Service layer
    @Autowired
    private HelloWorldService hws;

//    @GetMapping("/hello")
//    public String hello() {
//       return hws.helloWorld();
//    }
//    @PostMapping("/")
//    public String post(){
//        return hws.postMethod();
//    }
//    @PutMapping("/")
//    public String put(){
//        return hws.putMethod();
//    }
//    @DeleteMapping("/")
//    public String delete(){
//        return hws.deleteMethod();
//    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee e){
        hws.addEmployee(e);
        return "Employee Added Successfully";
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return hws.getAllEmployees();
    }
}
