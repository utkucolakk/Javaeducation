package com.example.springdata;

import ch.qos.logback.core.model.conditional.ElseModel;
import com.example.springdata.model.Employee;
import com.example.springdata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		test();
		//findAllEmployee();
		//findEmployeeById();
		updateEmployeeById();
		/*Employee employee = new Employee();
		employee.setAddress("ankara etimesgut");
		employee.setSurname("ronaldo");
		employee.setFirstname("cristiano");
		employee.setAge(29);
		employeeRepository.save(employee);*/

	}

	public void findAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
		/*for (Employee employee :employeeList) {
			System.out.println(employee.toString());
		}*/
		employeeList.forEach(System.out::println);
	}
	public void findEmployeeById() {
		Optional<Employee> employee = employeeRepository.findById(1L);
		//employee.ifPresent(System.out::println);
		Employee e = employee.orElse(new Employee());
		//Employee e = employee.orElse(null);

		System.out.println(e);
	}

	public void updateEmployeeById() {
		Employee employee = new Employee();
		employee.setEmployeeId(102L);
		employee.setAddress("ankara cankaya");
		employee.setSurname("ronaldo11");
		employee.setFirstname("cristiano");
		employee.setAge(29);
		employeeRepository.save(employee);

	}

	public void test() {
		List<Employee> employeeList = employeeRepository.findEmployeeByFirstnameAndSurname("c", "b");
		//List<Employee> asd = employeeRepository.findEmployeeByFirstnameOrAddressAndAge("c", "b", 20);
		System.out.println(employeeList.toString());
	}


}
