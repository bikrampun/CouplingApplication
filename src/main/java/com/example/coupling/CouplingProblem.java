package com.example.coupling;

public class CouplingProblem {
    //here, example for tight coupling as problem
    Doctor doctor = new Doctor();
    Engineer engineer = new Engineer();

    public CouplingProblem(Doctor doctor, Engineer engineer) {
        this.doctor = doctor;
        this.engineer = engineer;
    }
    public void showData(){
        doctor.display();
        engineer.display();
    }
}
