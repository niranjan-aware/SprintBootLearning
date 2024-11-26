package org.springboot.demospringboot.springDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwimCoach implements Coach {
    private static final Logger LOGGER= LoggerFactory.getLogger(SwimCoach.class);
    public SwimCoach() {
        LOGGER.info("In constructor"+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Coach";
    }
}
