package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Employee;
import com.example.demo.services.ServiceImplementation;
import com.example.demo.services.ServiceInterface;

@Controller
public class Controllers {
@Autowired
	ServiceInterface sr;

	@RequestMapping(value = "/")
	public String open() {
		System.out.println("little gupta");
		return "login";
	}

	@RequestMapping(value = "register")
	public String addemp(@ModelAttribute Employee emp) {
	
		sr.addemployee(emp);
		return "login";

	}

	@RequestMapping(value = "login")
	public ModelAndView login(@ModelAttribute("employee") Employee emp, HttpServletRequest req)
	{

		HttpSession session = req.getSession();
		List<Employee> ll = sr.login(emp);
		if (!ll.isEmpty()) 
		{
			session.setAttribute("emp", ll);
			return new ModelAndView("success", "emp", ll);
		} 
		else
			
		{

			return new ModelAndView("login");
		}

	}
	
	@RequestMapping(value = "edit")
	public ModelAndView editemp(@RequestParam("uid") int a) {
		Employee emp = sr.editEmployee(a);
		return new ModelAndView("edit", "emp", emp);

	}
	
	@RequestMapping(value="update")
	public ModelAndView edit(@ModelAttribute("employee") Employee employee)
	{

			sr.updateEmployee(employee);
			return new ModelAndView("login");
	
	}
	
	@RequestMapping("delete")
	public ModelAndView delemp(@RequestParam("uid") int a) {

		List<Employee> ll = new ArrayList<Employee>();
		int b = sr.deleteEmployee(a);
		if (b > 0)
		{
			ll = sr.showList();
		}
		return new ModelAndView("login", "emp", ll);
	}
	
	@RequestMapping(value="onlogout")
	public String logout()
	{
		
		return "login";
				
	}

	
}
