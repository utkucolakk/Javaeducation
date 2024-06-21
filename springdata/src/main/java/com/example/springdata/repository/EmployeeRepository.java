package com.example.springdata.repository;

import com.example.springdata.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeByFirstnameAndSurname(String firstname, String surname);

    Employee findEmployeeByFirstnameOrAddressAndAge(String firstname, String address, int age);

    // select * from employee where firstname = 'c' OR address = 'b' AND age = 20
    // List<Employee> findEmployeeByFirstnameOrAddressAndAge(String firstname, String address, int age)
}
