package com.greenqbit.bootcampboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Hibernate
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue //AUTO INCREMENT -> This is require for hibernate
    private Long id;
    private String name;
    private double price;
    private double rating;
    private int comments;
    private String imageUrl;

}
