package com.example.tpcontrolgraphql.service.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CarDTO {

    private String model;
    private String color;
    private String matricul;
    private String price;


}
