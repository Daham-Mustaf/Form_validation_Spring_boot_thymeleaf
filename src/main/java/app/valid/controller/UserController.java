package app.valid.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.Errors;
import app.valid.model.Person;

@org.springframework.stereotype.Controller
public class UserController {

	@GetMapping("/register")
	public ModelAndView showForm(Person person) {

		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("person", person);
		return modelAndView;
	}
	
	@PostMapping("/register")
	public ModelAndView formRegistration(@RequestBody @Valid @ModelAttribute("person") Person person, Errors errors) {
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("person", person);
		if (errors.hasErrors()) {
			return modelAndView;
		} else {
			modelAndView.addObject("message", "Registration successfully...");
			return modelAndView;
		}

	}
	

}
