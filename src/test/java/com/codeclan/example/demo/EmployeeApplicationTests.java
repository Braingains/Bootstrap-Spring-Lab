package com.codeclan.example.demo;

import com.codeclan.example.demo.models.Employee;
import com.codeclan.example.demo.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee bob = new Employee("Bob", 45, 12345, "bob@bob.com");
		employeeRepository.save(bob);

	}

}
