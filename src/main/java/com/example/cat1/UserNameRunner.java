package com.example.cat1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UserNameRunner implements CommandLineRunner {
    @Autowired
    private userNameRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(UserNameRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new UserName("Alice", "Smith","AliceNOW","adfad@yahoo","1111 Apple","Anaheim","Ca",92802));
        repository.save(new UserName("Alice2", "Smith2","AliceNOW","adfad@yahoo","1111 Apple","Anaheim","Ca",92802));
        repository.save(new UserName("john", "doe","AliceNOW","adfad@yahoo","1111 Apple","Anaheim","Ca",92802));
        System.out.println(repository.findByFirstName("Alice"));



    }

}
