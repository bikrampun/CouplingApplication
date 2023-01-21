package com.example;

import com.example.coupling.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CouplingApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CouplingApplication.class, args);
//        CouplingProblem problem = new CouplingProblem(new Doctor(), new Engineer());
//        problem.showData();
//        CouplingSolution solution = new CouplingSolution(new Doctor());
//        solution.showData();
//        CouplingSolution solution1 = new CouplingSolution(new Engineer());
//        solution1.showData();
        ApplicationContext context = SpringApplication.run(CouplingApplication.class, args);
        Job job = context.getBean(Doctor.class);
        job.display();
    }

}
