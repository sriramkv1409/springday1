package com.example.calculator;

import org.springframework.web.bind.annotation.*;

import static java.lang.Math.abs;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @PostMapping("/add")
    public double add(@RequestBody InputDto input) {
        return input.getA()+input.getB();
    }

    @PostMapping("/subtract")
    public double subtract(@RequestBody InputDto input) {
        return abs(input.getA()-input.getB());
    }

    @PostMapping("/multiply")
    public double multiply(@RequestBody InputDto input) {
        return input.getB()*input.getA();
    }

    @PostMapping("/divide")
    public double divide(@RequestBody InputDto input) {
        if (input.getB()==0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return input.getA()/input.getB();
    }
}
