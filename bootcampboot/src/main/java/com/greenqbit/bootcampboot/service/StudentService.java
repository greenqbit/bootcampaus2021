package com.greenqbit.bootcampboot.service;

import com.greenqbit.bootcampboot.dto.StudentDto;
import com.greenqbit.bootcampboot.entity.Student;
import com.greenqbit.bootcampboot.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    //This concept: Aspect Oriented Programming = (diff than OOP)
    /*@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository; //Dependecny(Bean or Object) Injection ( Inversion of Control), Dont call me I will call you
    }*/

    public List<StudentDto> findAll() {
        Iterable<Student> studentsIterable = studentRepository.findAll();
        List<Student> studLists = StreamSupport.stream(studentsIterable.spliterator(), false).collect(Collectors.toList());
        //return OR convert(map) to DTO

        //Steps look studetn list , copy student to the dto and return the list of student dto
       List<StudentDto> studentDtoList = studLists.stream().map((student) -> {
            StudentDto studDto = new StudentDto();
            studDto.setId(student.getId());
            studDto.setFirstName(student.getFirstName());
            studDto.setLastName(student.getLastName());
            studDto.setCollegeName(student.getCollegeName());
            studDto.setFee(student.getFee());
            studDto.setPhoto(null);
            return studDto;
        }).collect(Collectors.toList());

        return studentDtoList;
    }




}
