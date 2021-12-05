package app.valid.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import app.valid.model.Person;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public ModelAndView showForm(Person person) {

		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("person", person);
		return modelAndView;
	}

	@PostMapping("/")
	public String register(@Valid Person person, Errors errors, Model model) {
		if (errors.hasErrors()) {
			return "register";
		} else {
			model.addAttribute("message", "Registration successfully...");
			return "register";
		}

	}

}
