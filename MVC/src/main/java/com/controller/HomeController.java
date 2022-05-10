package com.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.controller.model.User;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model m) {
		m.addAttribute("name","Salman Shaikh");
		List<String> crushes = new ArrayList<String>();
		crushes.add("Rashmika");
		crushes.add("Alia");
		crushes.add("Sara");
		crushes.add("Jannat");
		crushes.add("Tara");
		crushes.add("Shraddha");
		crushes.add("Jasmin");
		crushes.add("Kriti");
		crushes.add("Janhavi");
		crushes.add("Kiara");
		m.addAttribute("c",crushes);
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView m = new ModelAndView();
		m.addObject("name","Salman Shaikh");
		
		LocalDateTime d = LocalDateTime.now();
		m.addObject("time",d);
		
		List<String> crushes = new ArrayList<String>();
		crushes.add("Rashmika");
		crushes.add("Alia");
		crushes.add("Sara");
		m.addObject("c",crushes);
		
		m.setViewName("help");
		return m;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	/*@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(HttpServletRequest h) {
		String n = h.getParameter("name");
		h.getParameter("pass");
		System.out.println(n);
		return "form";
	}*/
	//OR
	/*@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@RequestParam("name") String name,@RequestParam("pass") String password,Model m) {
		System.out.println(name);
		m.addAttribute("name",name);
		m.addAttribute("pass",password);
		return "success";
	}*/
	/*@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("name") String name,
			@RequestParam("pass") String password,
			Model m) {
		User u = new User();
		u.setName(name);
		u.setPass(password);
		m.addAttribute("u",u);
		return "success";
	}*/
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User u,Model m) {
		m.addAttribute("u",u);
		return "success";
	}     
}
