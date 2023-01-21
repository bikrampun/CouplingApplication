package com.example.coupling;

public class CouplingSolution {
    Job job;

    public CouplingSolution(Job job) {
        this.job = job;
    }
    public void showData(){
        job.display();
    }
}
