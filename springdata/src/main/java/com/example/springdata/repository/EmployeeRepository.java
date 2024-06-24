package com.example.springdata.repository;

import com.example.springdata.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeByFirstnameAndSurname(String firstname, String surname);

    Employee findEmployeeByFirstnameOrAddressAndAge(String firstname, String address, int age);

    // select * from employee where firstname = 'c' OR address = 'b' AND age = 20
    //  List<Employee> findEmployeeByFirstnameOrAddressAndAge(String firstname, String address, int age)


  /*  @Query("select e.employeeId from Employee e where e.firstname=:f and e.surname=:s")
    List<Long> findEmployeeListByFirstnameAndSurname(String f, String s);*/

    @Query("select e from Employee e where e.firstname=:f and e.surname=:s")
    List<Employee> findEmployeeListByFirstnameAndSurname(String f, String s);


    @Modifying
    @Transactional
    @Query("delete from Employee e where e.employeeId = :id")
    void  deleteEmployeeById(Long id);

    @Modifying
    @Query(value = "update employee set address = :address where employee_id = :id", nativeQuery = true)
    void updateAddressForEmployee(String address, Long id);

    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getAllEmployeeList();
}
