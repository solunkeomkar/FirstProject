package com.in28minutes.springboot.MyFirstWebApplication;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello this is my first WebApplication";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("FirstWeb");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("This is first web page ");
		sb.append("</body>");
		sb.append("</html>");
		
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody
	public String sayHelloJSP() {
		return "helloJSP";
	}

}
