package com.example.demo;

import com.example.demo.Calculator.calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.arraySorting.arraySorting;
import com.example.demo.calcArea.calcCircleArea;
import org.junit.jupiter.api.*;

@SpringBootTest
class DemoApplicationTests {




	@BeforeAll
	static void beforeAll(){
		System.out.println("Before all test cases");
	}


	calcCircleArea calcCircleArea = new calcCircleArea();

	@BeforeEach
	void init(){
		calcCircleArea = new calcCircleArea();
		System.out.println("Before each test case");
	}

	@Test
	void testAreaOfCircle(){
		double result = calcCircleArea.areaOfCircle(2);
		Assertions.assertEquals(12.566370614359172, result);
	}

	@Test
	void testAreaOfCircleWithNegativeRadius(){
		double result = calcCircleArea.areaOfCircle(-2);
		Assertions.assertEquals(12.566370614359172, result);
	}

	@AfterEach
	void tearDown(){
		calcCircleArea = null;
		System.out.println("After each test case");
	}


	@AfterAll
	static void afterAll(){
		System.out.println("After all test cases");
	}

	// @Test
	// void contextLoads() {
	// 	calculator calculator = new calculator();
	// 	String result = calculator.reverseString("hello");
	// 	Assertions.assertEquals("olleh", result);
	// 	result = calculator.reverseString("aditya");
	// 	Assertions.assertEquals("aytida", result);
	// }

	// @Test 
	// void testArraySorting(){
	// 	// int unshortedArray[] = {1,4,2,6,9,2,6,4};
	// 	int unshortedArray[] = null;
	// 	arraySorting arraySorting = new arraySorting();
	// 	Assertions.assertThrows(NullPointerException.class, () -> {
	// 		arraySorting.sortedArray(unshortedArray);
	// 	});
	// }

	// @Test
	// void testArrayUnderParticularTime(){
	// 	int unshortedArray[] = {1,4,2,6,9,3};
	// 	arraySorting arraySorting = new arraySorting();
	// 	Assertions.assertTimeout(java.time.Duration.ofMillis(1), () -> {
	// 		arraySorting.sortingWithMaxTime(unshortedArray);
	// 	}); 
	// }

}
