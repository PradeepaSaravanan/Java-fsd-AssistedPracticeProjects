package pkg7;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTesting {
	
	@TestFactory
	Collection<DynamicTest> dynamicTestWithCollection(){
		return Arrays.asList(
				DynamicTest.dynamicTest("Add Test", () -> assertEquals(2,Math.addExact(987765432 , 897656453))),
				DynamicTest.dynamicTest("Multiply Test",() ->assertEquals(6 ,Math.multiplyExact(2, 3)))
				);
	}
	

}
