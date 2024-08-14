package com.recap.springboot.rcrud.controller;


import com.recap.springboot.rcrud.enums.BrandType;
import com.recap.springboot.rcrud.model.Brand;
import com.recap.springboot.rcrud.repository.BrandRepository;
import com.recap.springboot.rcrud.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;
    @PostMapping("/create")
    public Brand createBrand(@RequestBody Brand brand) {
        return brandService.createBrand(brand);
    }

    @GetMapping("/all")
    public List<Brand> getAllBrandList() {
        return brandService.getAllBrandList();
    }
}
