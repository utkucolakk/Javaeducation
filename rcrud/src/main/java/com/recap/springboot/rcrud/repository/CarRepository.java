package com.recap.springboot.rcrud.repository;

import com.recap.springboot.rcrud.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT c FROM Car c WHERE c.brandId = :brandId")
    List<Car> findAllCarListByBrandId(@Param("brandId") Long brandId);
}
