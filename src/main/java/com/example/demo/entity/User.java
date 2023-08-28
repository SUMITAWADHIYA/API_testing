package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="user_tbl")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @GeneratedValue
//    @Column(name = "user_id")
    private Integer userId;

//    @Column(name = "name")
    private String name;

//    @Column(name = "email")
    private String email;

//    @Column(name = "mobile")
    private String mobile;

//    @Column(name = "gender")
    private String gender;

//    @Column(name = "age")
    private int age;

//    @Column(name = "nationality")
    private String nationality;
}
