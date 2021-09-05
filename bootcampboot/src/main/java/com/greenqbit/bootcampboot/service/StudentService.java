package com.greenqbit.bootcampboot.service;

import com.greenqbit.bootcampboot.dto.StudentDto;
import com.greenqbit.bootcampboot.entity.Student;
import com.greenqbit.bootcampboot.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Transactional
@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    //This concept: Aspect Oriented Programming = (diff than OOP)
    /*@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository; //Dependecny(Bean or Object) Injection ( Inversion of Control), Dont call me I will call you
    }*/

    @Transactional(readOnly = true)
    //CRUD: Read
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

    //@Deprecated CRUD: Create/Update => save
    public Student save(Student student) {
        Student dbStud = studentRepository.save(student);
        return dbStud;
    }

    //CRUD: Create/Update => save
    public StudentDto saveWithDto(StudentDto studDto) {
        Student stud = new Student();
        //no need to set ID because its auto incremented by hibernate/postgres
        stud.setFirstName(studDto.getFirstName());
        stud.setLastName(studDto.getLastName());
        stud.setCollegeName(studDto.getCollegeName());
        stud.setFee(studDto.getFee());
        stud.setPhotoUrl(null);

        //Save to database
        stud = studentRepository.save(stud);

        /*StudentDto stDto = new StudentDto();
        stDto.setId(stud.getId());
        stDto.setFirstName(stud.getFirstName());
        stDto.setLastName(stud.getLastName());
        stDto.setCollegeName(stud.getCollegeName());
        stDto.setFee(stud.getFee());
        stDto.setPhoto(null);*/

        //Replace by builder design pattern
        StudentDto stDto = StudentDto.builder()
                .id(stud.getId())
                .firstName(stud.getFirstName())
                .lastName(stud.getLastName())
                .collegeName(stud.getCollegeName())
                .fee(stud.getFee())
                .photo(null)
                .build();

        return stDto;
    }


    //CRUD: delete
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }


}
