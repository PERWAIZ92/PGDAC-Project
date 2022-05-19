package com.modoc.dao;

//public interface ContactRepository {



	import java.util.List;

	import com.modoc.model.Contacts;
	import com.modoc.model.Customers;

	/**
	 * Interface that contains methods for contactRepositoryImpl
	 * 
	 * @author admin
	 *
	 */
	public interface ContactRepository {

		/**
		 * Gets contacts of user
		 * 
		 * @param user
		 * @return List of contacts
		 */
		List<Contacts> getUserContacts(Customers customer);

		/**
		 * Finds contact by contactId
		 * 
		 * @param contactId
		 * @return contact object
		 */
		Contacts findContactById(Integer contactId);

		/**
		 * Saves contact in database
		 * 
		 * @param contact
		 */
		void createContact(Contacts contact);

		/**
		 * Removes contact from database
		 * 
		 * @param contact
		 */
		void deleteContact(Contacts contact);

		/**
		 * Edits existing contact
		 * 
		 * @param contact
		 */
		void editContact(Contacts contact);
	}
