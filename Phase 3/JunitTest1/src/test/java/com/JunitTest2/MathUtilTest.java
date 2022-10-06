package com.JunitTest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTest {

	
	MathUtil m= new MathUtil();
	@Test
	void test_add() {
		assertEquals(3,m.add(1, 2));
	
	}
	@Test
	void test_multiply() {
		assertEquals(8,m.multiply(4, 2));
	}

	
	@Test
	void test_even() {
		assertEquals(true,m.isEven(8));
	}
	@Test
	void test_divide() {

		assertEquals(4, m.divide(8, 2));
	}
	@Test
	void test_prime() {
		assertEquals(true, m.isPrime(7));
	}

}
