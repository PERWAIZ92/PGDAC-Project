package com.modoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.modoc.dao.CustomerRepository;
import com.modoc.model.Customers;

@SpringBootApplication
public class SpringModocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringModocApplication.class, args);
		//start to save in db
		
/*
		ApplicationContext context = SpringApplication.run(SpringModocApplication.class, args);
		CustomerRepository customerrepo = context.getBean(CustomerRepository.class);
		Customers customer= new Customers();
		Customers customer1=customerrepo.save(customer);
		*/
	}

}
