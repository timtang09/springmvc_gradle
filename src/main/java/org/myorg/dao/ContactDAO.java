package org.myorg.dao;

import java.util.List;

import org.myorg.model.Contact;

//@Component
//@Repository
public interface ContactDAO {
	public List<Contact> listContact();
}
