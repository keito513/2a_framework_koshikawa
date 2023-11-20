package com.example.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class gitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String gitlogin() {
		return "gitlogin";
	}

	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String gitlogin(String ID, String PW, RedirectAttributes redirectAttributes) throws IOException {
		redirectAttributes.addFlashAttribute("ID", ID);
		redirectAttributes.addFlashAttribute("PASS", PW);
		if ("gitlogin".equals(ID) && "gitpw".equals(PW)) {
			return "/gititemlist";
		} else {
			return "/gitpralogin";
		}
	}
}