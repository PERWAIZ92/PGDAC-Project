package com.modoc.service.impl;


	import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

	import com.modoc.model.Customers;
	import com.modoc.dao.CustomerRepository;
	import com.modoc.service.CustomerService;
import com.modoc.model.Customers;
import com.modoc.service.CustomerService;

	@Service
	public class CustomerServiceImpl  {
//public class CustomerServiceImpl implements CustomerService {
/*
		@Autowired
		CustomerRepository customerRepository;

		@Override
		public void save(Customers customer) {
			if (customer != null) {
				customerRepository.save(customer);
			}

		}
*/
		/*
		@Override
		public Customers findByEmailAndPassword(String email, String password) {
			Customers customer = null;
			if (email != null && password != null) {
				customer = customerRepository.findByEmailAndPassword(email, password);
			}
			return customer;
		}
*/


	}
