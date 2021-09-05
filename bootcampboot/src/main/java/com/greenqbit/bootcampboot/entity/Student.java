package com.greenqbit.bootcampboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//ORM => JPA framework => Hibernate
//For the hibernate /ie database

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

//Hibernate
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue //AUTO INCREMENT -> This is require for hibernate
    private Long id; //number,int, bigint

    @Column(name = "passport_no")
    private String passportNo; //Sensitive (X Dont send it to frontend)

    @Column(name = "first_name") //varchar
    private String firstName;

    @Column(name = "last_name") //varchar
    private String lastName;

    @Column(name = "college_name") //varchar
    private String collegeName;

    private double fee;

    @Column(name="photo_url")
    private String photoUrl; //c:\\picaus\stuune.jpg

    //constructor / getter / setter/ toString / equals


}
