package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String gitlogin() {
		return "gitlogin";
	}

	//	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	//	public String gitlogin(String ID, String PW, RedirectAttributes redirectAttributes) throws IOException {
	//		redirectAttributes.addFlashAttribute("ID", ID);
	//		redirectAttributes.addFlashAttribute("PASS", PW);
	//	}
}