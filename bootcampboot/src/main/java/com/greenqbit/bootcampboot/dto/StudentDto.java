package com.greenqbit.bootcampboot.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto { //POJO class: Plain OLD Java Object, Data Transfer Object(DTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String collegeName;
    private Double fee;
    private MultipartFile photo;


}
