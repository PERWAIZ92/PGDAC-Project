package com.modoc.service;




	import java.util.List;

	import com.modoc.model.Contacts;
	import com.modoc.model.Customers;

	/**
	 * Service which works with contact repository {@ContactRepository}
	 * @author admin
	 *
	 */
	public interface ContactService {
		
		List<Contacts> getUserContacts(Customers customer);

		Contacts findContactById(Integer contactId);

		void createContact(Contacts contact);

		void deleteContact(Contacts contact);

		void editContact(Contacts contact);
	}

