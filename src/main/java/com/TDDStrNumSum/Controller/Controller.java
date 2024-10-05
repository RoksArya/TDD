package com.TDDStrNumSum.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TDDStrNumSum.Service.StringSumService;

@RestController
@RequestMapping("/myApp")
public class Controller {
	
	@Autowired
	StringSumService strService;
	
	@GetMapping("/version")
	public String getVersion() {
		return "1.0";
	}

	@GetMapping("/sumString")
	public ResponseEntity<?> sumString(@RequestParam String str) {
		try {
		int sum = strService.add(str);
		System.out.println(sum+":"+ str);
		return new ResponseEntity<>(sum, HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
		}
	}
}
