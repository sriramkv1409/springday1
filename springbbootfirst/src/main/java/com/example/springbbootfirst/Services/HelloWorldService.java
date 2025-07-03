package com.example.springbbootfirst.Services;

import com.example.springbbootfirst.Models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {
    List<Employee> emp = new ArrayList<>(List.of(
            new Employee(1, "Prasanth", "Trainer"),
            new Employee(2, "Yuvaraj", "Faculty")
    ));

//    public String helloWorld(){
//        return "Hello World";
//    }
//
//    public String postMethod(){
//        return "This is Post Method";
//    }
//
//    public String putMethod(){
//        return "This is Put Method";
//    }
//
//    public String deleteMethod(){
//        return "This is Delete Method";
//    }
public void addEmployee(Employee e) {
    emp.add(e);
}

    public List<Employee> getAllEmployees() {
        return emp;
    }
}
