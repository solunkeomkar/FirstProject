package com.in28minutes.springboot.MyFirstWebApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	AuthenticationService authenticationService;
		
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="loginPage",method=RequestMethod.GET)
	public String loginJSP()
	{
		return "login";
	}
	
	@RequestMapping(value="loginPage",method=RequestMethod.POST)
	public String welcomeJSP(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		if(authenticationService.isAuthenticatedUser(name,password))
		{
		model.put("name",name);
		model.put("password",password);
		return "welcomePage";
		}
		return "login";
		
	}
	
}
