package pkg4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class lambdaExample {
	
	@Test
	
	public void assertTests() {
    String str = null;
      String str2 = "some values";
      String str3 = "some values";
      
      String a1[] = {"A" , "B"};
      String a2[] = {"A" , "B"};
      
      assertTrue(4 > 0);
      
      assertFalse(5 > 1);
      
      assertNull(str);
      
      assertNotNull(str2);
      
      //assertSame(str , str);
      
      //assertNotSame(str , str2);
      
      assertEquals(5 ,5);
      
      assertNotEquals(5 ,6);
      
      assertArrayEquals(a1 , a2);
      
      //assertSame(a1 , a2);
      
     // assertSame(str2 , str3);
      
      assertThrows(RuntimeException.class , () -> { throw new RuntimeException();});
      
}}
