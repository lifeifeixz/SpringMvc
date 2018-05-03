package com.sm.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("userController")
@RequestMapping("/userController")
public class UserController {
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request){
		ModelAndView model = new ModelAndView("main");
		List<String> names = new ArrayList<>(10);
		Enumeration<String> enums = request.getServletContext().getInitParameterNames();
		while(enums.hasMoreElements()){
			System.out.println(enums.nextElement());
		}
		model.addObject("name", "就不告诉你");
		return model;
	}
}
