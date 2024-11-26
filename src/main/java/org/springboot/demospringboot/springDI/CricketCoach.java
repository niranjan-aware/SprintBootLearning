package org.springboot.demospringboot.springDI;


import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//creating bean with component
@Component
public class CricketCoach implements Coach {

    private static final Logger LOGGER = LoggerFactory.getLogger(CricketCoach.class);

    public CricketCoach() {
        LOGGER.info("In constructor"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "play cricket";
    }

}
