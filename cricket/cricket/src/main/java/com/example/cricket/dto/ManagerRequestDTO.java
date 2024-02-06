package com.example.cricket.dto;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Hidden
public class ManagerRequestDTO {
    String teamName;
    String password;
}
