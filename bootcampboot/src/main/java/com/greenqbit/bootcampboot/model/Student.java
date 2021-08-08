package com.greenqbit.bootcampboot.model;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student { //POJO class: Plain OLD Java Object
    private Long id;
    private String firstName;
    private String lastName;
    private String collegeName;
    private Double fee;
    private MultipartFile photo;


}
