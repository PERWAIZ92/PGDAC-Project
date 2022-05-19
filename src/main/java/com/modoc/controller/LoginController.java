package com.modoc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modoc.dao.CustomerRepository;
import com.modoc.model.Customers;



	@Controller
public class LoginController {
	
		@Autowired	
		private CustomerRepository customerrepo ;
		
/*
		@Autowired	
		private Customers customer ;
	*/	
		@RequestMapping(value="/login", method= RequestMethod.GET)

		public String showLogin() {
			return "login";
		}
		
		@RequestMapping(path="/ValidateServlet", method=RequestMethod.POST)
		
//		public String loginUser(@RequestParam(value = "login") String email,
		public String loginUser(@RequestParam("email") String email,
				@RequestParam("password") String password, HttpServletRequest request, Model model, ModelMap model1)
		{
												
			model.addAttribute("password",customerrepo.findByPassword(password));
			
		model1.put("errorMsg", "Please provide valid credential");
			
			return "profile";
		}
	
	
		/*
	
		
			@RequestMapping(path="/ValidateServlet", method=RequestMethod.POST)
			
			public String loginUser(@RequestParam(value = "login") String email, @RequestParam("password") String password,
					HttpServletRequest request, Model model) {
				String page = null;
				HttpSession session = request.getSession();
	           Customers customer = customerrepo.findByEmailAndPassword(email, password);
			//	Customers customer=(Customers) session.getAttribute("currentUser");
			/*
	           if (customer != null) {
					session.setAttribute("currentUser", customer);
					page = "redirect:/home";
				} 
				/*
				else {
					model.addAttribute("loginError", true);
					model.addAttribute("loginValue", email);
					page = "login";
		//		}
				*/
		//		return page;
		//		return "profile";
		//	}	
		
		
		
		/*
		@RequestMapping(path="/ValidateServlet", method=RequestMethod.POST)
		
	public String loginUser(@RequestParam(value = "email") String email,
//		public String loginUser(
			//	@RequestParam("email") String email,
				@RequestParam("password") String password,
				HttpServletRequest request, Model model, ModelMap model1) {
																//show in browser
		//	model.addAttribute("email",customerrepo.findByEmail(email));
			
		//	HttpSession session = request.getSession();
	           Customers cust = customerrepo.findByEmailAndPassword(customer.getEmail(), customer.getPassword());
		if (cust==null) {
			throw new RuntimeException("not exist");
		}
	

		model1.put("errorMsg", "Please provide valid credential");
			
			return "profile";
		
	
		}
	*/
	
	}
		
