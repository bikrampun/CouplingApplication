package com.example.coupling;

public class Doctor implements Job{
    @Override
    public void display() {
        System.out.println("I'm doctor.");
    }
}
