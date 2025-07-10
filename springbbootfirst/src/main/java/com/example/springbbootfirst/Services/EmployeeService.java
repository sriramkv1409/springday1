package com.example.springbbootfirst.Services;

import com.example.springbbootfirst.Models.RegisterDetails;
import com.example.springbbootfirst.Repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    private RegisterDetailsRepository details;

    public List<RegisterDetails> getAllEmployees() {
        return details.findAll();
    }


    public RegisterDetails getEmployeeById(int empId){
       Optional<RegisterDetails> employee = details.findById(empId);
       return employee.orElse(null);
    }


    public String deleteEmployeeById(int empId) {
          if(details.existsById(empId)){
              details.deleteById(empId);
              return "EMPLOYEE DELETED SUCCESSFULLY";
          }
          else{
              return "Employee not found";
          }
    }

    public String deleteAllEmployee(){
    if(!details.findAll().isEmpty()){
        details.deleteAll();
        return "Employee data deleted Successfully";
    }
    else{
        return "Employee data is empty";
    }
    }

    public String updateRecord(RegisterDetails employee){
        if(details.existsById(employee.getEmpId())){
            details.save(employee);
            return "Employee updated Successfully";
        }
        else{
            return "Employee not found";
        }
    }

}
