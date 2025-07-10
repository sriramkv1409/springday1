package com.example.springbbootfirst.Services;

import com.example.springbbootfirst.Models.RegisterDetails;
import com.example.springbbootfirst.Repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    RegisterDetailsRepository registerDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public String addNewEmployee(RegisterDetails registerDetails){

        System.out.println("Saving: " + registerDetails);
        registerDetails.setPassword(passwordEncoder.encode(registerDetails.getPassword())); //hashing the pass
        RegisterDetails saved =  registerDetailsRepository.save(registerDetails);
        System.out.println(saved);
        return "Employee Added Successfully";
    }

    public List<RegisterDetails> getAllDetails() {
        return registerDetailsRepository.findAll();
    }

    public String authenticateUser(String email, String password) {
        RegisterDetails user = registerDetailsRepository.findByEmail(email);

        if (user == null) {
            return "User not found!";
        }

        if (!passwordEncoder.matches(password, user.getPassword())) {
            return "Invalid password!";
        }

        return "Login successful for: " + user.getEmpname();
    }
}
