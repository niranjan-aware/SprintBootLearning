package org.springboot.demospringboot.controller;

import org.springboot.demospringboot.dao.StudentDAO;
import org.springboot.demospringboot.dao.StudentDaoImpl;
import org.springboot.demospringboot.exceptions.StudentErrorResponse;
import org.springboot.demospringboot.exceptions.StudentNotFoundException;
import org.springboot.demospringboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetStudents {

    @Autowired
    private StudentDAO studentDAO;

//    @GetMapping("/student/{studentId}")
//    public void getStudent(@PathVariable("studentId") int studentId , @RequestParam String Name, @RequestHeader("Authorization") String activation, @RequestBody Student student) {
//        System.out.println("studentId  "+studentId+"  "+"activationToken   "+ activation +"   student   "+ student);
//    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId ) {
        if(studentId>3){
            throw new StudentNotFoundException("Student with id "+studentId+" not found");
        }
        return studentDAO.findById(studentId);
    }

    //for exception thrown we need to handle also

    //code removed in StudentRestExceptionHandler to AOP(@ControllerAdvice) global use
    // if any api throws that it will every thime pass through it
    // client <-->  ControllerAdvice  <--> apiResponse thrown from server

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {
//        StudentErrorResponse errorResponse = new StudentErrorResponse();
//        errorResponse.setMessage(e.getMessage());
//        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
//    }

//    @RequestParam
//    @RequestBody
//    @RequestHeader
}
