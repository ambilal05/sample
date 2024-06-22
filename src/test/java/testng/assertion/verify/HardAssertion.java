package testng.assertion.verify;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void assertMethod() {
		String name = "Muthu";
		
//		if(name.equals("muthu")) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
		
		//Assert.assertEquals("muthu", name);
		//Assert.assertNotEquals("muthu", name);
		
		//Assert.fail();
		
		boolean isDisplayed = false;
		
		Assert.assertTrue(isDisplayed);
	}
}
