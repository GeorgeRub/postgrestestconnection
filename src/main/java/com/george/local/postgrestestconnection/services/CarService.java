package com.george.local.postgrestestconnection.services;

import com.george.local.postgrestestconnection.models.Car;
import com.george.local.postgrestestconnection.repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private CarRepository carRepository;


    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

}
