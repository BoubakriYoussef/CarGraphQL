package com.example.tpcontrolgraphql.dao.repository;

import com.example.tpcontrolgraphql.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findCarByModel(String model);
    List<Car> findCarByModelAndPrice(String model, double price);
}
