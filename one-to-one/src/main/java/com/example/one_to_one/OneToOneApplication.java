package com.example.one_to_one;

import com.example.one_to_one.model.Address;
import com.example.one_to_one.model.Person;
import com.example.one_to_one.repository.PersonRepository;
import org.hibernate.type.descriptor.java.spi.JsonJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		oneToOneSelect();

	}

	public void oneToOneSave() {
		Person person = new Person();
		Address address = new Address();
		address.setCity("kırsehir");
		address.setStreet("koz modern");

		person.setName("furkan");
		person.setAddress(address);
		Person savedPerson = personRepository.save(person);
		System.out.println(savedPerson);
	}

	public void oneToOneDelete() {
		personRepository.deleteById(2L);
	}


	public void oneToOneSelect() {
		Optional<Person> person = personRepository.findById(3L);
		person.ifPresent(System.out::println);
	}

}
