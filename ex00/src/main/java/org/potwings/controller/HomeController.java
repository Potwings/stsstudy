package org.potwings.controller;

import java.util.Locale;

import org.potwings.dao.TimeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private TimeDAO dao;

	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {

	
		String DBTime = dao.getTime();
		
		System.out.println(DBTime);

		model.addAttribute("DBTime", DBTime);

		return "home";
	}

}
