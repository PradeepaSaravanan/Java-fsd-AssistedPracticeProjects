package com.JunitTest3;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class AssertMethods {
    @Test
	public void assertTest()
	{
		String s1=null;
		String s2="Welcome";
		String s3="Welcome";
		
		String a1[]= {"a","b"};
		String a2[]= {"a","b"};
		
		assertTrue(4>2);
		assertFalse(8>9);
		assertNull(s1);
		assertNotNull(s2);
		assertEquals(23,23);
		assertNotEquals(19,23);
		assertSame(s1,s1);
		assertNotSame(s1,s2);
		assertArrayEquals(a1,a2);
		assertSame(s2,s3);
		//assertSame(a1,a2);// fail
		
		
		assertThrows(RuntimeException.class,()->{ throw new RuntimeException();});
		
		
	}
}
