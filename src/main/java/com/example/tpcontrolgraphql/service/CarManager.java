package com.example.tpcontrolgraphql.service;


import com.example.tpcontrolgraphql.service.dtos.CarDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarManager {
    List<CarDTO> getCarByModel(String model);
    List<CarDTO> getCarByModelAndPrice(String model,double price);
    CarDTO saveCar(CarDTO carDTO);
    CarDTO deleteCar(Long id);
}
