package com.TDDStrNumSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.TDDStrNumSum.Service.StringSumService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TddStrNumSumApplicationTests {

	@Autowired
	StringSumService strSumService;
	

	@Test
	@Order(1)
	@DisplayName("Test Empty String")
	void testEmptyStr() {
		String str = "";
		assertEquals(0, strSumService.add(str));
	}

	@Test
	@Order(2)
	@DisplayName("Test One Number")
	void TestOneNumberStr() {
		String str = "1";
		assertEquals(1, strSumService.add(str));
	}

	@Test
	@Order(3)
	@DisplayName("Test Two Number")
	void TestTwoNumberStr() {
		String str = "1,2";
		assertEquals(3, strSumService.add(str));
	}

	@Test
	@Order(4)
	@DisplayName("Test Multiple Numbers for \\n")
	void TestSlashN() {
		String str = "1,2,23,\n";
		assertEquals(26, strSumService.add(str));
	}
	
	@Test
	@Order(5)
	@DisplayName("Test Negative Numbers")
	void TestNegative() {
		String str = "1,22,33,-43,67";
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
			strSumService.add(str);
		});
		assertTrue(thrown.getMessage().contains("negative numbers not allowed"));
		
	}
	
	@Test
	@Order(6)
	@DisplayName("Test Delimeters")
	void Testdelimeters() {
		String str = "1,22,33,//;\n1,43,67";
		assertEquals(167,strSumService.add(str));
		
	}
	
	
	
	

}
