package com.example.cricket.dto;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Hidden
public class ManagerSignUpRequestDTO {
    String teamName;
    String password;
    String image;
    String color;
}

