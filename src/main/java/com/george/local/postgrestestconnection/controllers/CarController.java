package com.george.local.postgrestestconnection.controllers;

import com.george.local.postgrestestconnection.models.Car;
import com.george.local.postgrestestconnection.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${com.george.db.request.key.v1}car")
@AllArgsConstructor
public class CarController {

    private CarService carService;

    @GetMapping("")
    public ResponseEntity<?> carList() {
        List<Car> carList = carService.findAll();
        return ResponseEntity.ok(carList);
    }

    @PostMapping("")
    public ResponseEntity<?> saveCar(@RequestBody Car car) {
        Car newCar = carService.saveCar(car);
        return ResponseEntity.ok(newCar);
    }

}
