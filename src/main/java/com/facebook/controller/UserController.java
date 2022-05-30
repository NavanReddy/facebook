package com.facebook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.model.User;
import com.facebook.service.UserService;


@Controller
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/register")
	public String showRegister(Model model) {
		
		model.addAttribute("User",new User());
		
		return "User";
	}
		
		@PostMapping("/save")
		public String save(@ModelAttribute User user, Model model) {
			
			Integer Id = userservice.saveUser(user);
			
			String message = "User '+id+ ' saved Successfully";
			
			model.addAttribute("message", message);
			
			return "User Register";
			
		}
		
		@GetMapping("/all")
		public String fetchAll(Model model) {

			List<User> list = userservice.getAllUser();

			model.addAttribute("list", list);

			return "User";
		}

		// 4. Remove one by ID

		@GetMapping("/delete/{id}")
		public String removeById(@PathVariable Integer id, Model model) {

			userservice.deleteUserById(id);

			String message = "user ' " + id + " ' Deleted";

			model.addAttribute("message", message);

			
			return "ShipmentTypeRegister";

			// return "redirect:../all";
		}

			
				
	}


