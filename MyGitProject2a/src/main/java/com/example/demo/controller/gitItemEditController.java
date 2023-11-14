package com.example.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {

	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String editg() throws IOException {

		
		return "gititemedit";
	}
	
	@RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
	public String editp(Model model,String itemname,String price) throws IOException {

		model.addAttribute("name", itemname);
		model.addAttribute("price", price);
		return "gititemedit2";
	}
}
