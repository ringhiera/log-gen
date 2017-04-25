package com.impe.test.log_gen.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "LogGen API");
		return "index";

	}

}
