package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/") //this annotation is for specifying the url that will trigger this method
	public String home() {
		return "hello everyone";
	}
	
	

}
