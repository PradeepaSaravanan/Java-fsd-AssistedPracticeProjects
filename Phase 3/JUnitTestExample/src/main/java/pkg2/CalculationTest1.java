package pkg2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationTest1 {
	@Test
 void test()
 {
	 Calculation obj= new Calculation();
	 assertEquals(19,obj.addition(12, 2));
 }
}