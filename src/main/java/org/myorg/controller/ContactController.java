package org.myorg.controller;

import java.util.Map;

import org.myorg.model.Contact;
import org.myorg.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping("/contact")
	public String listContacts(Map<String, Object> map) {

		map.put("contactList", contactService.listContact());

		return "contact";
	}
}
