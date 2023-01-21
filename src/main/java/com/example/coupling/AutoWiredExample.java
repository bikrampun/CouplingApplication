package com.example.coupling;

import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class AutoWiredExample {
    @Autowired
    Job job;

    public void showData(){
        job.display();
    }
}
