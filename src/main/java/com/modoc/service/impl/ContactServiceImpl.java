package com.modoc.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modoc.model.Contacts;
import com.modoc.model.Customers;
import com.modoc.dao.ContactRepository;
import com.modoc.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public List<Contacts> getUserContacts(Customers customer) {
		if (customer != null) {
			return contactRepository.getUserContacts(customer);
		}
		return null;
	}

	@Override
	public Contacts findContactById(Integer contactId) {
		if (contactId != null)
			return contactRepository.findContactById(contactId);
		return null;
	}

	@Override
	public void createContact(Contacts contact) {
		if (contact != null)
			contactRepository.createContact(contact);

	}

	@Override
	public void deleteContact(Contacts contact) {
		if (contact != null)
			contactRepository.deleteContact(contact);

	}

	@Override
	public void editContact(Contacts contact) {
		if (contact != null)
			contactRepository.editContact(contact);

	}

}
