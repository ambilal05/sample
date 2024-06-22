package testng.attributies;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	//How to use different class @Test in dependsOnMethods?
	   //declare with packagename.ClassName.methodName

	@Test
	public void signIn() {
		System.out.println("Method 1");
		int i = 1/0;
	}
	
	@Test
	public void ztest() {
		System.out.println("Method 3");
	}
	
	//@Test(dependsOnMethods="signIn")
	@Test(dependsOnMethods="testng.attributies.Enabled.test2")
	public void checkout() {
		System.out.println("Method 2");
	}
}
