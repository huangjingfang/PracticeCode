package com.h3c.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/account")
public class AccountController {

	@RequestMapping(value="/login",produces = "text/plain,charset=UTF-8",method= {RequestMethod.GET})
	public String login(HttpServletRequest request,HttpServletResponse response,Model model) {
		return "hello Spring";
	}
}
