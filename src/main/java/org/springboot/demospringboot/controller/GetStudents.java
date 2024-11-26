package org.springboot.demospringboot.controller;

import org.springboot.demospringboot.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetStudents {

    @GetMapping("/student/{studentId}")
    public void getStudent(@PathVariable("studentId") int studentId , @RequestParam String Name, @RequestHeader("Authorization") String activation, @RequestBody Student student) {
        System.out.println("studentId  "+studentId+"  "+"activationToken   "+ activation +"   student   "+ student);
    }

//    @RequestParam
//    @RequestBody
//    @RequestHeader
}
