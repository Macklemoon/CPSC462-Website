package com.example.cat1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class favoriteRunner implements CommandLineRunner {
    @Autowired
    private favoriteRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(favoriteRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
    repository.save(new favorite("Catwomen1","Hi first time","catsomethig.png"));

    }
}