package com.recap.springboot.rcrud.service;

import com.recap.springboot.rcrud.model.Car;
import com.recap.springboot.rcrud.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCarList() {
        return carRepository.findAll();
    }

    public List<Car> findAllCarListByBrandId(Long brandId) {
        return carRepository.findAllCarListByBrandId(brandId); //mapstruct araştırabilirim entity to dto için.
    }

    public void deleteCarById(Long carId) {
        carRepository.deleteById(carId);
    }
}
