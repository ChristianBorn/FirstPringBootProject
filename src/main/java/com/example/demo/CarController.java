package com.example.demo;

import model.Car;
import org.springframework.web.bind.annotation.*;
import service.CarService;

import java.util.List;

@RestController
@RequestMapping("/carservice")
public class CarController {
    private final CarService carServiceApp = new CarService();

    @GetMapping()
    public List<Car> showAllCars() {
        return carServiceApp.getCars();
    }

    @PostMapping()
    public void addCar(@RequestBody Car car) {
        System.out.println(car);
        carServiceApp.addCar(car);
    }



    }

