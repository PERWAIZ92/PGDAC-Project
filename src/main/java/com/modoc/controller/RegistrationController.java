package com.modoc.controller;



	import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpSession;
//	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modoc.dao.CustomerRepository;
import com.modoc.model.Customers;
//	import com.modoc.service.CustomerService;

	/**
	 * Controls registration requests
	 * 
	 * @author admin
	 *
	 */
	@Controller

	public class RegistrationController {
/*
		@Autowired
		private CustomerService customerService;
		*/
//		@Autowired
//		private Customers customer;

	
		@Autowired
		private CustomerRepository customerrepo;
		/*
		@GetMapping("/registeration")
		public String register(Model model) {
			model.addAttribute("customer", new Customers());
			return "registeration";
		}
		*/
		@PostMapping("/registration")
		public String showForm(HttpServletRequest request) throws ServletException {
			Customers customer = null;
			String password = customer.getPassword();
			customer.setPassword(password);
			request.login(customer.getEmail(), password);
			
			return "registration";
		}
		
		
		
		
		
	
		
		@RequestMapping("/registration")
		public String showForm() {
			return "registration";
		}
	
		
		
		/*
		@RequestMapping(path="/processform", method=RequestMethod.POST)
		public String handleForm(
				@RequestParam("email")String userEmail,
				@RequestParam("userName")String userName,
				@RequestParam("password")String userPassword,
				Model model) {
			System.out.println("user email is "+userEmail); //show in console
			System.out.println("user name is "+userName);
			System.out.println("user password is "+userPassword);
			
			model.addAttribute("name",userName);      //show in browser
			model.addAttribute("email",userEmail);
			model.addAttribute("password",userPassword);
			
			return "profileCust";
		}
		*/
		@RequestMapping(path="/processform", method=RequestMethod.POST)
		public String handleForm(@ModelAttribute Customers u,
				@RequestParam("email")String userEmail,
				@RequestParam("username")String userName,
				@RequestParam("password")String userPassword,
				Model model) {
			System.out.println("user email is "+userEmail); //show in console
			System.out.println("user name is "+userName);
			System.out.println("user password is "+userPassword);
			
			model.addAttribute("username",userName);      //show in browser
			model.addAttribute("email",userEmail);
			model.addAttribute("password",userPassword);
			customerrepo.save(u);

			
			return "profileCust";
		}
		
		/*
		@PostMapping("/processform")
		public String signUp(@ModelAttribute Customers u,HttpSession session) {
			System.out.println(u);
			customerService.save(u);
	//		session.setAttribute("message", "user register successfully...");
			return "redirect:/";
		}
		
		*/
		
		
		/*
		
		@GetMapping("/registration")
		public String getRegistrationPage(Model model) {
			Customers customer = new Customers();
			model.addAttribute("newUser", customer);
			return "registration";
		}
*/
		
		
		
		
	
		/*
		public String registerUser(@ModelAttribute("newUser") @Validated Customers customer, BindingResult result,
				HttpServletRequest request, Model model) {
			if (result.hasErrors()) {
				return "registration";
			}
		
			Customers existingUser = customerService.findByEmail(customer.getEmail());
			if (existingUser != null) {
				model.addAttribute("loginError", true);
				return "registration";
			}
			
			HttpSession session = request.getSession();
			{
				customerService.save(customer);
				session.setAttribute("currentUser", customer);
				return "redirect:/home";
			}
			}
			*/
		
	
}
