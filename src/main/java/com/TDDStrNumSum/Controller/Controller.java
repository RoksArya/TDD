package com.TDDStrNumSum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myApp")
public class Controller {
	
	@GetMapping("/version")
	public String getVersion() {
		return "1.0";
	}

}
