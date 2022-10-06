package com.JunitTest1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName ("Junit 5 test case")
class Testcase1 {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before all test cases");
	}
	@BeforeEach
	public  void beforeEach()
	{
		System.out.println("Before each test cases");
	}
	@DisplayName("standard Test")
	@Test
	public void test()
	{
		System.out.println("Test case1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test case2");
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("after all test cases");
	}
	@AfterEach
	public  void afterEach()
	{
		System.out.println("after each test cases");
	}
	@Disabled
	@Test
	public void skippedTest()
	{
		System.out.println("Skipped Test case");
	}
}
