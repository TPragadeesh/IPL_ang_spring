package com.example.cricket.dto;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
@Hidden
public class PlayerRequestDTO {

    String playerName;
    String category;
    String auctionPrice;
    String team;
    String image;
    String strength;
    String weakness;
    String status;

}
