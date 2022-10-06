package pkg3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class MathUtilTest {
	@Test
	 void test()
	 {
		 MathUtil s= new MathUtil();
		 assertEquals(19,s.add(12,2));
		 assertEquals(24,s.multiple(12, 2));
		 assertEquals(true,s.isEven(0));
		 assertEquals(6,s.devide(12, 2));
		 assertEquals(true,s.isPrime(2));
		 
		 
	 }

}
