package testng.assertion.verify;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void verifyMethod() {
		String name = "Muthu";
		
//		if(name.equals("muthu")) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
		
		SoftAssert verify = new SoftAssert();
		verify.assertEquals("muthu", name);
		//verify.assertNotEquals("muthu", name);
		
		//verify.fail();
		
//		boolean isDisplayed = false;
//		
//		verify.assertTrue(isDisplayed);
	}
}
