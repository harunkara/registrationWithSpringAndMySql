package com.example.registration.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.registration.Model.people;
import com.example.registration.Repository.InformationRepository;
import com.example.registration.Service.peopleService;

@RestController
public class RegistrationController {
@Autowired
private peopleService peopleService; 
@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
public ModelAndView savePeople(@ModelAttribute("people") people people)  
{  if (people.getPassword()!=null) {
		peopleService.savePeople(people);			
	}
ModelAndView modelAndView = new ModelAndView();
modelAndView.setViewName("AnaSayfa");
return modelAndView;
     
}
}

