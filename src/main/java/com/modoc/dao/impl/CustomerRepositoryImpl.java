package com.modoc.dao.impl;



	import javax.persistence.EntityManager;
	import javax.persistence.NoResultException;
	import javax.persistence.PersistenceContext;
	import javax.transaction.Transactional;
	import org.springframework.stereotype.Repository;

	import com.modoc.model.Customers;
	import com.modoc.dao.CustomerRepository;

	@Repository
	@Transactional
//	public class CustomerRepositoryImpl implements CustomerRepository {
	public class CustomerRepositoryImpl {
		// An EntityManager will be automatically injected from entityManagerFactory
		// setup on DatabaseConfig class.
		@PersistenceContext
		private EntityManager entityManager;

		public void save(Customers customer) {
			entityManager.persist(customer);
		}

		public Customers findByEmailAndPassword(String email, String password) {
			try {
				return (Customers) entityManager.createQuery("from Users where email = :email and password = :password")
						.setParameter("email", email).setParameter("password", password).getSingleResult();
			} catch (NoResultException e) {
			}
			return null;

		}

		public Customers findByEmail(String email) {
			try {
				return (Customers) entityManager.createQuery("from Users where email = :email").setParameter("email", email)
						.getSingleResult();
			} catch (NoResultException e) {
			}
			return null;

		}

	}
 
