package com.modoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.modoc.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{
//public interface CustomerRepository{
	
	
//	@Query("SELECT c FROM Customers c WHERE c.email = ?1")
	
	
	
	/**
	 * Saves user in database
	 * 
	 * @param user
	 */
	//void save(Customers customer);

	//Object email = null;

	/**
	 * Get user from database by login and password
	 * 
	 * @param email
	 * @param password
	 * @return found user
	 */
	Customers findByEmailAndPassword(String email, String password);

	/**
	 * Finds user by login
	 * 
	 * @param email
	 * @return user object
	 */
	Customers findByEmail(String email);
	
	Customers findByPassword(String password);

}
