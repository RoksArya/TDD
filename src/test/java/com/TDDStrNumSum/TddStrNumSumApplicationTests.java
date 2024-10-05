package com.TDDStrNumSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.TDDStrNumSum.Service.StringSumService;

@SpringBootTest
class TddStrNumSumApplicationTests {

	@Autowired
	StringSumService strSumService;
	
	@Test
	void contextLoads() {
		String str = "";
		assertEquals(0,strSumService.add(str));
	}

}
