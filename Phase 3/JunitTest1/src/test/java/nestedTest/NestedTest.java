package nestedTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("Root Test")
public class NestedTest {

	@Test
	void test() {
		System.out.println("-> testA");
	}
    
	@Nested
	@DisplayName("Nested test A")
	class TestA {
		@Test
		void testA_test1() {
			System.out.println("->testA_test1");
		}
		
		@Nested
		@DisplayName("Nested test A")
		class TestAA
		{
			@Test
			 void testAA_test1()
			 {
				 System.out.println("-> testAA_test1");
			 }
		}
	}
	
	@Nested
	@DisplayName("Nested test B")
	class testB{
		@Test
		void testB_test1()
		{
			System.out.println("->testB_test1");
		}
	}
}
