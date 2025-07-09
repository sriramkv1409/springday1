package com.example.springbbootfirst.Services;

import com.example.springbbootfirst.Models.Employee;
import com.example.springbbootfirst.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class HelloWorldService {
    @Autowired
    private EmployeeRepository employeeRepository;
public String addEmployee(Employee employee) {
    employeeRepository.save(employee);
    return "Employee Added Successfully!";
}

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public Employee getEmployeeById(int eid){
       Optional<Employee> employee = employeeRepository.findById(eid);
       return employee.orElse(null);
    }

    public Employee getEmployeeByJob(String job){
       return employeeRepository.findByJob(job);
    }

    public String deleteEmployeeById(int eid) {
          if(employeeRepository.existsById(eid)){
              employeeRepository.deleteById(eid);
              return "EMPLOYEE DELETED SUCCESSFULLY";
          }
          else{
              return "Employee not found";
          }
    }

    public String deleteAllEmployee(){
    if(!employeeRepository.findAll().isEmpty()){
        employeeRepository.deleteAll();
        return "Employee data deleted Successfully";
    }
    else{
        return "Employee data is empty";
    }
    }

    public String updateRecord(Employee employee){
        if(employeeRepository.existsById(employee.getEid())){
            employeeRepository.save(employee);
            return "Employee updated Successfully";
        }
        else{
            return "Employee not found";
        }
    }
}
