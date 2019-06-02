package com.jante;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/add")
	public String add(HttpServletRequest req, Model model)
	{
		//System.out.println("hello frm spring -mvc");
		String fname = req.getParameter("fname");
		System.out.println("first name--"+fname);
		String lname = req.getParameter("lname");
		System.out.println("last name--"+lname);
//		ModelAndView modelObject = new ModelAndView();
		model.addAttribute("fname",fname);
		model.addAttribute("lname",lname);
		return "login";
	}
}
