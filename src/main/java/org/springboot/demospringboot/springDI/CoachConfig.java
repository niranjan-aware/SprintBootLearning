package org.springboot.demospringboot.springDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//creating bean with configuration
@Configuration
public class CoachConfig {

    @Bean("aquatic")
    public Coach getCoach() {
        return new SwimCoach();
    }
}
