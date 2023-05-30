package com.example.springsecuritytestproject;

import com.example.springsecuritytestproject.model.User;
import com.example.springsecuritytestproject.repo.UserRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityTestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTestProjectApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(UserRepo userRepo, PasswordEncoder passwordEncoder){
        return args -> {
            userRepo.save(new User("dias", passwordEncoder.encode("dias"),"USER"));
            userRepo.save(new User("admin", passwordEncoder.encode("admin"),"ADMIN"));
        };
    }
}
