package Test9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(FooParameterResolver.class)
class DepnddencyInjection2 {

	@Test
	@Tag("my-tag")
	void test(Calculation c) {
		assertEquals(8,c.addition(4, 4));
	}

}
