package com.example.spring_kpi_sem_5.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RunnerFirst implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("RunnerSecond");
    }
}