package Assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {
	
	@Test
	 public void testOne() {
		System.out.println("This is Test number 1");
		String one ="Hello World";
		Assert.assertEquals(one, "Hello World");
		
	}
	
	@Test(groups= {"groupingMethods1"})
	 public void testTwo() {
		System.out.println("This is Test number 2");
		
	}
	

	@Test(groups= {"groupingMethods2"})
	 public void testThree() {
		System.out.println("This is Test number 3");
		
	}
	

	
	@Test
	 public void testFour() {
		System.out.println("This is Test number 4");
		
	}
	

	

}
