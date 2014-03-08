package org.myorg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.myorg.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ContactDAOImpl implements ContactDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Contact> listContact() {
		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

}
