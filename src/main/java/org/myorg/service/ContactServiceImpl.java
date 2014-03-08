package org.myorg.service;

import java.util.List;

import org.myorg.dao.ContactDAO;
import org.myorg.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDAO contactDAO;
	
	@Transactional
	public List<Contact> listContact() {
		return contactDAO.listContact();
	}

}
