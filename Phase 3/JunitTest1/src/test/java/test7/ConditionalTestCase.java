package test7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.JRE;

class ConditionalTestCase {

	@Test
	@DisabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_10)
	void notFromJava8to11() {
		System.out.println("not execute for the range 8 to 11 ");
	}
	
	@Test
	@EnabledForJreRange(min=JRE.JAVA_12, max=JRE.JAVA_18)
	void FromJava12to18() {
		System.out.println(" execute for the range 12 to 18 ");
	}
/***************************************************************/
	/*************************************************************************************/
	/*@Test
	@EnabledIf("customConditionalFunction")
	void enabled() {
	    assertTrue(true);
	}
	@Test
	@DisabledIf("customConditionalFunction")
	void disabled() {
	    assertTrue(true);
	}
	boolean customConditionalFunction() {
	    return true;
	}*/
	
/***************************************************************************/
	@Test
	  @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
	  void runOnlyOnOracleJDK() {
	    System.out.println("Run this only on Oracle JDK");
	  }
	@Test
	  @DisabledIfSystemProperty(named = "os.version", matches = ".*10.*")
	  void notRunOnlyOnWindows10() {
	    System.out.println("not run this only on windows 10 version");
	  }
	
	@Test
	  @EnabledIfEnvironmentVariable(named = "COMPUTERNAME", matches = "LAPTOP-NLDC4M13")
	  void runOnlyOnPerticularMachine() {
	    System.out.println("Run this only on perticular server");
	  }
}
