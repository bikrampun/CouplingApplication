package com.example.coupling;

import org.springframework.stereotype.Component;

@Component
public class Engineer implements Job{
    @Override
    public void display() {
        System.out.println("I'm engineer.");
    }
}
