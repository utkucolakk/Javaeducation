package com.recap.springboot.rcrud.controller;

import com.recap.springboot.rcrud.model.Car;
import com.recap.springboot.rcrud.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;
    @PostMapping("/create")
    public Car create(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping("/all")
    public List<Car> getAllListCar() {
        return carService.getAllCarList();
    }

    @GetMapping("/{brandId}")
    public List<Car> getCarListByBrandId(@PathVariable("brandId") Long brandId) {
        return carService.findAllCarListByBrandId(brandId);
    }

    @DeleteMapping("/{carId}/{abc}")
    public void deleteCarById(@PathVariable("carId") Long carId, @PathVariable("abc") Long abc) {
        carService.deleteCarById(carId);
    }
}
