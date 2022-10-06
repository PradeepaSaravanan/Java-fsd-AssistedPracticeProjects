package com.JunitTest1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculationTest {
	@Test
	@DisplayName("Add Operation")
	@RepeatedTest(5)
 void test()
 {
	 Calculation obj= new Calculation();
	 assertEquals(14,obj.addition(12, 2),"12+2 equals to 14");
	 System.out.println("mentioned number of  times testcase returned ");
 }
}
