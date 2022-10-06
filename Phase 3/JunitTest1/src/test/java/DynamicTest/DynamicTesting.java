package DynamicTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.JunitTest2.MathUtil;

class DynamicTesting {
	@TestFactory
	Collection<DynamicTest> dynamictestwith_collection()
	{
		return Arrays.asList(
		DynamicTest.dynamicTest("Add test", ()->assertEquals(2,MathUtil.add(12345,45678))),
		DynamicTest.dynamicTest("Multiply test", ()->assertEquals(12,MathUtil.multiply(4,3)))
		);
	}

}
