package com.example;

import com.example.coupling.CouplingProblem;
import com.example.coupling.CouplingSolution;
import com.example.coupling.Doctor;
import com.example.coupling.Engineer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouplingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouplingApplication.class, args);
//        CouplingProblem problem = new CouplingProblem(new Doctor(), new Engineer());
//        problem.showData();
        CouplingSolution solution = new CouplingSolution(new Doctor());
        solution.showData();
        CouplingSolution solution1 = new CouplingSolution(new Engineer());
        solution1.showData();
    }

}
