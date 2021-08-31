package com.greenqbit.bootcampboot.controller;

import com.greenqbit.bootcampboot.dto.StudentDto;
import com.greenqbit.bootcampboot.entity.Student;
import com.greenqbit.bootcampboot.repository.StudentRepository;
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
    private StudentRepository studentRepository; //Dependecny(Bean or Object) Injection ( Inversion of Control), Dont call me I will call you

    @RequestMapping(value = "/api/stud", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents() {
        Iterable<Student> studentsIterable = studentRepository.findAll();
        List<Student> studLists = StreamSupport.stream(studentsIterable.spliterator(), false).collect(Collectors.toList());
        return ResponseEntity.ok(studLists);

        //TODO: No 5: Service and DTO Mapping
//      shortcut ->  return ResponseEntity.ok(StreamSupport.stream(studentRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }

    @RequestMapping(value = "/api/stud2", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents2() {

        //Comment and fetch data from database?
        /*
        StudentDto studRam = new StudentDto(1L, "Erin", "Kar", "NCIT", 900d, null);
        StudentDto studSam = new StudentDto(2L, "Sam", "K", "Rand", 2923d, null);
        StudentDto studSum = new StudentDto(2L, "Suman", "Chaud", "Rand", 2923d, null);
        List<StudentDto> studentsList = new ArrayList<>(); //OOP => parent(List) => child ArrayList
        studentsList.add(studRam); //0 index
        studentsList.add(studSam); //1 index
        studentsList.add(studSum); //2 index
        */

        Iterable<Student> all = studentRepository.findAll(); //DB: 3 record
        //No 3: Direct casting to List<Student>

        //How to convert Iterable to List?
        //No 1: Not popular today
        List<Student> studsDBList = new ArrayList<>();
        Iterator<Student> iterator = all.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            studsDBList.add(student);
        }

        //No 2: TODO: stream (Java 8 Stream API)
        List<Student> studLists = StreamSupport.stream(all.spliterator(), false).collect(Collectors.toList());

        //Problem 1: List 5 country name save them in list, filter country start with N and n,
        List<String> countries = new ArrayList<>();
        countries.add("Australia"); //0
        countries.add("Nepal"); //1
        countries.add("Japan"); //2
        countries.add("USA"); //3
        countries.add("Netherland"); //4
//        System.out.println(countries.get(1)); //Nepal
//        System.out.println(countries.get(4)); //Netherland
        //?how to solve: create a new list from coutry with name start from N
        List<String> countriesWithN = new ArrayList<>();
        //1.loop countries
        for (String country : countries) { //for each(data)
//            if(country.substring(0, 1).equals("N")){
            if (country.startsWith("N") || country.startsWith("n")) {
                countriesWithN.add(country);
            }
            //countries.remove(1);
        }
        //Learning Function programming in the Java
        Stream<String> cStream = Stream.of("Australia", "Nepal", "Japan", "USA", "Netherland");
        List<String> retList =
                cStream.filter((country) -> country.startsWith("N") || country.startsWith("n"))
                        .filter((country) -> Arrays.asList("Nepal").contains(country))
                        .collect(Collectors.toList());

        //Problem 2: Value double
        List<Integer> nos = Arrays.asList(10, 20, 30, 20, 40, 50);
        List<Integer> nosDouble = nos.stream().map((no) -> no * 2).collect(Collectors.toList());//20, 40, 60, 40, 80, 100
        //Problem 3: convert list to set
        Set<Integer> setofNos = nos.stream().collect(Collectors.toSet()); //10, 20, 30, 40, 50
        List<Integer> uniqueListNos = nos.stream().distinct().collect(Collectors.toList());//10, 20, 30, 40, 50

//         .forEach((country) -> {
//            System.out.println(country);
//        }); //Nepal, Netherland

        //No 3: fitler



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
