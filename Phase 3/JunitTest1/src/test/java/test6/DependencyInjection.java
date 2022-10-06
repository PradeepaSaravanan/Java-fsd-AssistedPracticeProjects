package test6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
@DisplayName("Dependency Injection")
class DependencyInjection {

	void DependencyInjection1(TestInfo testinfo)
	{
		assertEquals("Junit 5 Dependency Injection", testinfo.getDisplayName());
	}
	@BeforeEach
	void init(TestInfo testinfo)
	{
	 String displayName= testinfo.getDisplayName();
	 assertTrue(displayName.equals("Test 1")||displayName.equals("test 2"));
	}
	@Test
	@DisplayName("Test 1")
	@Tag("my-tag")
	void test1(TestInfo testinfo)
	{
		assertEquals("Test 1", testinfo.getDisplayName());
		assertTrue(testinfo.getTags().contains("my-tag"));
	}

}
