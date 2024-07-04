package com.example.onetomany;

import com.example.onetomany.model.Category;
import com.example.onetomany.model.Product;
import com.example.onetomany.repository.CategoryRepository;
import com.example.onetomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {


	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//insertData();
		findCategoryAndProductList();
	}

	private void deleteData(Long id) {
		productRepository.deleteById(id);
	}

	private void insertData() {
		Category category = new Category();
		category.setId(1L);
		category.setName("dairy");

		Product product = new Product();
		product.setPrice(15.30);
		product.setName("yogurt2");
		product.setCategory(category);

		productRepository.save(product);
		System.out.println("succesfully saved");
	}

	private void findCategoryAndProductList() {
		Optional<Category> category = categoryRepository.findById(1L);

        category.ifPresent(System.out::println);
	}
}
