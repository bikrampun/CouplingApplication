package com.example.coupling;

public class Engineer implements Job{
    @Override
    public void display() {
        System.out.println("I'm engineer.");
    }
}
