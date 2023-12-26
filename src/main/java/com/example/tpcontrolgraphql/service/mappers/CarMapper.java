package com.example.tpcontrolgraphql.service.mappers;

import com.example.tpcontrolgraphql.dao.entities.Car;
import com.example.tpcontrolgraphql.service.dtos.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Car fromCarDtoToCar(CarDTO carDTO){
        return this.modelMapper.map(carDTO,Car.class);
    }

    public CarDTO fromCarToCarDTO(CarDTO car ){
        return this.modelMapper.map(car,CarDTO.class);
    }

}