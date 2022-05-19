package com.modoc.dao.impl;


	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.NoResultException;
	import javax.persistence.PersistenceContext;
	import javax.transaction.Transactional;

	import org.springframework.stereotype.Repository;

	import com.modoc.model.Contacts;
	import com.modoc.model.Customers;
	import com.modoc.dao.ContactRepository;

	import com.modoc.dao.CustomerRepository;

	@Repository
	@Transactional

	public class ContactRepositoryImpl implements ContactRepository {

		@PersistenceContext
		private EntityManager entityManager;

	
		public List<Contacts> getUserContacts(Customers customer) {
			try {
				return entityManager.createQuery("from Contacts where userId = :userId").setParameter("userId", customer)
						.getResultList();
			} catch (NoResultException e) {
			}
			return null;

		}	
/*	
		public List<Contacts> getUserContacts(Customers customer) {
			try {
				return entityManager.createQuery("from Contacts where userId = :userId").setParameter("userId", customer)
						.getResultList();
			} catch (NoResultException e) {
			}
			return null;

		}
*/
		public void createContact(Contacts contact) {
			entityManager.persist(contact);
		}

		public void deleteContact(Contacts contact) {
			if (entityManager.contains(contact))
				entityManager.remove(contact);
		}

		public void editContact(Contacts contact) {
			entityManager.merge(contact);

		}

		public Contacts findContactById(Integer contactId) {
			try {
				return (Contacts) entityManager.createQuery("from Contacts where contactId =:contactId")
						.setParameter("contactId", contactId).getSingleResult();
			} catch (NoResultException e) {
			}
			return null;

		}

	



	}

