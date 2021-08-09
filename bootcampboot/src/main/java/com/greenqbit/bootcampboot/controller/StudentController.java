package com.greenqbit.bootcampboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.greenqbit.bootcampboot.model.Student;

import java.util.*;

//To handle the request from /stud
@Controller
@RequestMapping(value = "/stud") //GET,POST,DELETE
public class StudentController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView studGet() {

        //Task:
        // 1. Fetch all the student from the database
        // return to frontend ( frontend show that data).
        Student studRam = new Student(1L, "Erin", "Kar", "NCIT", 900d, null);
        Student studSam = new Student(2L, "Sam", "K", "Rand", 2923d, null);
        Student studSum = new Student(3L, "Suman", "Chaud", "Rand", 2923d, null);
        List<Student> studentsList = new ArrayList<>(); //OOP => parent(List) => child ArrayList
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
