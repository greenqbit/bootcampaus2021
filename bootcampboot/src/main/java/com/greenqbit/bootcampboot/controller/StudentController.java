package com.greenqbit.bootcampboot.controller;

import com.greenqbit.bootcampboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.greenqbit.bootcampboot.dto.StudentDto;

import java.util.*;

//To handle the request from /stud
@Controller
@RequestMapping(value = "/stud") //GET,POST,DELETE
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    //Aspect Oriented Programming
    //    dependency(Bean or Object) Injection ( Inversion of Control), Dont call me I will call you :)

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView studGet() {

        //NO 1 StudentRepository ob  = new StudentRepository();

        //Task:
        // 1. Fetch all the student from the database
        // return to frontend ( frontend show that data).
        StudentDto studRam = new StudentDto(1L, "Erin", "Kar", "NCIT", 900d, null);
        StudentDto studSam = new StudentDto(2L, "Sam", "K", "Rand", 2923d, null);
        StudentDto studSum = new StudentDto(3L, "Suman", "Chaud", "Rand", 2923d, null);
        List<StudentDto> studentsList = new ArrayList<>(); //OOP => parent(List) => child ArrayList
        studentsList.add(studRam); //0 index
        studentsList.add(studSam); //1 index
        studentsList.add(studSum); //2 index

        //Collection class: List(ArrayList, LinkedList), Set(HashSet, LinkedHashSet),
//        int size = studentsList.size(); //3
//        Student retStudSam = studentsList.get(1); //we get studSam
//        studentsList.remove(2);
//        studentsList.clear();//size 0




        //MVC:
        //1.browser sent request to the controller
        //2. controller => put data inside model(create data)
        //3. controller => go to view
        //4. View => html generate and send it back to frontend

        //Step 2: create a model
        ModelAndView mv = new ModelAndView("stud");
        mv.addObject("studentsList", studentsList);
        return mv;
    }


}
