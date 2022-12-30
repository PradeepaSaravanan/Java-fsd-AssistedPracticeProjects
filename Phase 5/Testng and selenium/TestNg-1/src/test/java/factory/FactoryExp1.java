package factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
class SampleTest{
	private int count;
	public SampleTest(int count) {
		this.count=count;
	}
	@Test
	public void testmethod() {
		count++;
		System.out.println("count="+count);
	}
}
public class FactoryExp1 {
  
	@Factory
	Object[] factoryMethod() {
		return new Object[] {new SampleTest(3)};
	}
}
