package com.example.springdata;

import ch.qos.logback.core.model.conditional.ElseModel;
import com.example.springdata.model.CustomerOrderDTO;
import com.example.springdata.model.Employee;
import com.example.springdata.repository.EmployeeRepository;
import com.example.springdata.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Transactional // ben bunu ekledim çünkü tek bir işlemde birden fazla veritabanı işlemi yaptığında içlerinden en az 1 tanesi hata alırsa diğer işlemleri de iptal etmeye yarıyor. Ek olarak DELETE UPDATE gibi kendi sorgularım(JPQL) de gerekli.
public class SpringdataApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//test();
		//findAllEmployee();
		//findEmployeeById();
		//updateEmployeeById();
		/*Employee employee = new Employee();
		employee.setAddress("ankara etimesgut");
		employee.setSurname("ronaldo");
		employee.setFirstname("cristiano");
		employee.setAge(29);
		employeeRepository.save(employee);*/
		//deleteEmployeeById(302L);
		//findAllEmployeeThenDelete();
		//findEmployeeListByFirstnameAndSurname();
		//deleteEmployeeByIdJPQL();
		//updateEmployeeByIdNative();
		//getAllEmployeeNative();
		customerOrderDTO();


	}

	public void findAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
		/*for (Employee employee :employeeList) {
			System.out.println(employee.toString());
		}*/
		employeeList.forEach(System.out::println);
	}
	public void findEmployeeById() {
		Optional<Employee> employee = employeeRepository.findById(152L);
		//employee.ifPresent(System.out::println);
		Employee e = employee.orElse(new Employee());
		//Employee e = employee.orElse(null);

		System.out.println(e);
	}

	public void updateEmployeeById() {
		Employee employee = new Employee();
		employee.setEmployeeId(152L);
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

	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

	public void findAllEmployeeThenDelete() {
		List<Employee> employeeList = employeeRepository.findAll();
		employeeList.stream().filter(e -> e.getEmployeeId().equals(252L)).forEach(e -> employeeRepository.delete(e));

	}

	public void findEmployeeListByFirstnameAndSurname() {
		List<Employee> employeeList =employeeRepository.findEmployeeByFirstnameAndSurname("bb", "aa");
		employeeList.forEach(System.out::println);
	}

	public void deleteEmployeeByIdJPQL() {
		employeeRepository.deleteEmployeeById(152L);

	}

	public void updateEmployeeByIdNative() {
		employeeRepository.updateAddressForEmployee("abc",202L);
	}

	public void getAllEmployeeNative() {
		List<Employee> employeeList = employeeRepository.getAllEmployeeList();
		employeeList.forEach(System.out::println);
	}

	public void customerOrderDTO() {
		List<CustomerOrderDTO> orderDTOList = orderRepository.findOrderNameAndCustomerName();
		orderDTOList.forEach(System.out::println);
	}
}
