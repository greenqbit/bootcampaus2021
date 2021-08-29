package com.greenqbit.bootcampboot.controller;

import com.greenqbit.bootcampboot.dto.StudentDto;
import com.greenqbit.bootcampboot.entity.Student;
import com.greenqbit.bootcampboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController //rest API
public class RestStudentController {

    //This concept: Aspect Oriented Programming = (diff than OOP)
    @Autowired //Wiring
    private StudentRepository studentRepository; //Dependecny(Bean or Object) Injection ( Inversion of Control), Dont call me I will call you

    @RequestMapping(value = "/api/stud", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents() {

        //Comment and fetch data from database?
        /*StudentDto studRam = new StudentDto(1L, "Erin", "Kar", "NCIT", 900d, null);
        StudentDto studSam = new StudentDto(2L, "Sam", "K", "Rand", 2923d, null);
        StudentDto studSum = new StudentDto(2L, "Suman", "Chaud", "Rand", 2923d, null);
        List<StudentDto> studentsList = new ArrayList<>(); //OOP => parent(List) => child ArrayList
        studentsList.add(studRam); //0 index
        studentsList.add(studSam); //1 index
        studentsList.add(studSum); //2 index*/

        Iterable<Student> all = studentRepository.findAll(); //3 record
        //No 3: Direct casting to List<Student>

        //How to convert Iterable to List?
        //No 1:
        List<Student> studsDBList = new ArrayList<>();
        Iterator<Student> iterator = all.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            studsDBList.add(student);
        }

        //No 2: TODO: stream

        //No 3: TODO: fitler
        
        //No 5: Service and DTO Mapping

//        ResponseEntity<List<Student>> resp = new ResponseEntity<>(studentsList, HttpStatus.OK);
//        return resp;
        //OR shortcut
        return ResponseEntity.ok(studsDBList); //Response
    }

    @RequestMapping(value = "/api/stud/{id}", method = RequestMethod.GET) // => /api/stud/2
    public StudentDto getStud() {
        return null;
    }


}
