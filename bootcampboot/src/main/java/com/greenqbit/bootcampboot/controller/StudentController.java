package com.greenqbit.bootcampboot.controller;

import com.greenqbit.bootcampboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

//To handle the request from /stud
@Controller
@RequestMapping(value = "/stud") //GET,POST,DELETE
public class StudentController {

    @RequestMapping(method = RequestMethod.GET)
    public String studGet() {

        //Task:
        // 1. Fetch all the student from the database
        // return to frontend ( frontend show that data).
        Student studRam = new Student(1L, "Ram", "Shretha", "NCIT", 900d, null);
        Student studSam = new Student(2L, "Sam", "Smitch", "Rand", 2923d, null);

        String[] x = new String[10]; //=> array fast, easy, memore direct access, sequenctial
        List<String> xy = new ArrayList<String>(); //Diamond Operator=> feature from Java 7


        return "stud";
    }


}
