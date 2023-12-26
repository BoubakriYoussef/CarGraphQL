package com.example.tpcontrolgraphql.web;

import com.example.tpcontrolgraphql.service.CarManager;
import com.example.tpcontrolgraphql.service.dtos.CarDTO;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQlController {

    private CarManager carManager;

    public CarGraphQlController(CarManager carManager) {
        this.carManager = carManager;
    }

    @QueryMapping

    List<CarDTO> getCarByModel(@Argument String model){
        return carManager.getCarByModel(model);
    }

    List<CarDTO> getCarByModelAndPrice(@Argument String model,@Argument double price){
        return carManager.getCarByModelAndPrice(model, price);
    }
    @MutationMapping
    CarDTO saveCar(@Argument CarDTO carDTO){
        return carManager.saveCar(carDTO);
    }
    CarDTO deleteCar(@Argument Long id){
        return carManager.deleteCar(id);
    }


































}
