package com.example.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String gitlogin() {
		return "gitlogin";
	}

	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String gitloginpost(String ID, String PW) throws IOException {
		if ("gitlogin".equals(ID) && "gitpw".equals(PW)) {
			return "redirect:/gititemlist";
		} else {
			return "redirect:/gitlogin";
		}
	}
}