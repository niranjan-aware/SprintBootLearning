package org.springboot.demospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestApi {

    @GetMapping("/home")
    public String hello() {
        return "Hello World";
    }
}
