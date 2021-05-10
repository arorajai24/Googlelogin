package com.gradmanagement.project;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	@ResponseBody
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/home")
	@ResponseBody
	public String home()
	{
		return "any user can access this AGAINN";
	}
	
	@GetMapping("/xyz")
	public String login()
	{
		return "index";
	}
	
	@GetMapping("/logout-success")
	public String logout()
	{
		return "redirect:/";
	}
	
	@GetMapping("/prevent")
	public String prevent(Principal principal)
	{
		return principal.getName();
	}
}
