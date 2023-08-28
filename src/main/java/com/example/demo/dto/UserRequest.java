package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserRequest {

    private String name;
    private String email;
    private String mobile;
    private String gender;
    private Integer age;
    private String nationality;
}
