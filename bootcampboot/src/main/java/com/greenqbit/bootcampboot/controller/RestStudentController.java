package com.greenqbit.bootcampboot.controller;

import com.greenqbit.bootcampboot.dto.StudentDto;
import com.greenqbit.bootcampboot.entity.Student;
import com.greenqbit.bootcampboot.repository.StudentRepository;
import com.greenqbit.bootcampboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController //rest API
public class RestStudentController {

    //This concept: Aspect Oriented Programming = (diff than OOP)
    @Autowired //Wiring
    private StudentService studentService; //Dependecny(Bean or Object) Injection ( Inversion of Control), Dont call me I will call you

    @RequestMapping(value = "/api/stud", method = RequestMethod.GET)
    public ResponseEntity<List<StudentDto>> getStudents() {
        //No 5: Service and DTO Mapping
        List<StudentDto> studentDtoList = studentService.findAll();
        return ResponseEntity.ok(studentDtoList);
    }





    @RequestMapping(value = "/api/stud/{id}", method = RequestMethod.GET) // => /api/stud/2
    public StudentDto getStud() {
        return null;
    }

}
