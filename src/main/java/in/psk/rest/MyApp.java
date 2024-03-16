package in.psk.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.psk.AppService;

@RestController
public class MyApp {
@Autowired
private AppService service;
@GetMapping("/welcome")
	public String getMessae()
	{
	
		return service.getWelcomeMessage();
		
	}
}
