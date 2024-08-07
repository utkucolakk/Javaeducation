package com.example.crud.controller;

import com.example.crud.model.Employee;
import com.example.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);

    }

    @GetMapping
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("/older")
    public List<Employee> findEmployeeListWhoOlderThan20() {
        return employeeService.findEmployeeListWhoOlderThan20();
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long id) {
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
}
