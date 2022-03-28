package com.example.spring_initializr2;

import com.example.spring_initializr2.models.Kompis;
import com.example.spring_initializr2.repositories.KompisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringInitializr2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringInitializr2Application.class, args);
    }

    @Bean
    public CommandLineRunner friend(KompisRepository kompisRepository) {
        return (args) -> {
            // save a new friends
            kompisRepository.save(new Kompis("Hassan Hamid", "7634234356"));
            kompisRepository.save(new Kompis("Emil Eyre", "703736464634"));
            kompisRepository.save(new Kompis("Jason Da", "7634739284"));
            kompisRepository.save(new Kompis("Erik Bovary", "7612332145"));
            kompisRepository.save(new Kompis("Madison Parker", "7098778934"));
        };
    }

}
