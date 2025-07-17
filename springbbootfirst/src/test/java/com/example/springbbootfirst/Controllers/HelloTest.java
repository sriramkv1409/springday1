package com.example.springbbootfirst.Controllers;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    public void testHelloTest(){
        Hello hell = new Hello();
        String str = hell.helloTest();
        System.out.println(str);
        assertEquals("Hello test",str);
    }
}
