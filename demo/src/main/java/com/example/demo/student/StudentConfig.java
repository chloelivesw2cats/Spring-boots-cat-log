package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student belle = new Student(
                    "Belle",
                    "beobeo@gmail.com",
                    LocalDate.of(2019, APRIL, 5)
            );
            Student catherine = new Student(
                    "Catherine",
                    "fishyfish@gmail.com",
                    LocalDate.of(2019, OCTOBER, 7)
            );
            repository.saveAll(
                    List.of(belle, catherine)
            );
        };
    }
}
