package com.modoc.service;



//	import org.springframework.data.jpa.repository.JpaRepository;

import com.modoc.model.Customers;

	/**
	 * Service which works with {@UserRepository}
	 * @author admin
	 *
	 */
//public interface CustomerService{
public interface CustomerService  {

		void save(Customers customer);

	Customers findByEmailAndPassword(String email, String password);
		
		Customers findByEmail(String email);
		
		
	}
