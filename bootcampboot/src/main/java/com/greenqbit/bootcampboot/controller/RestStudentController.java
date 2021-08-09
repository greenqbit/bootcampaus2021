package com.greenqbit.bootcampboot.controller;

import com.greenqbit.bootcampboot.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //rest API
public class RestStudentController {

    @RequestMapping(value = "/api/stud", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents() {

        //Tomorrow? Save students in the database, fetch from database.
        Student studRam = new Student(1L, "Erin", "Kar", "NCIT", 900d, null);
        Student studSam = new Student(2L, "Sam", "K", "Rand", 2923d, null);
        Student studSum = new Student(2L, "Suman", "Chaud", "Rand", 2923d, null);
        List<Student> studentsList = new ArrayList<>(); //OOP => parent(List) => child ArrayList
        studentsList.add(studRam); //0 index
        studentsList.add(studSam); //1 index
        studentsList.add(studSum); //2 index

//        ResponseEntity<List<Student>> resp = new ResponseEntity<>(studentsList, HttpStatus.OK);
//        return resp;
        //OR shortcut
        return ResponseEntity.ok(studentsList); //Response
    }

    @RequestMapping(value = "/api/stud/{id}", method = RequestMethod.GET) // => /api/stud/2
    public Student getStud() {
        return null;
    }


}
