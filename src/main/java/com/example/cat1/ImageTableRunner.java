package com.example.cat1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ImageTableRunner implements CommandLineRunner {
    @Autowired
    private ImageTableRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ImageTableRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();
        repository.save(new ImageTable("asdfaf"));
        repository.save(new ImageTable("asdfafadfadf"));

    }
}
