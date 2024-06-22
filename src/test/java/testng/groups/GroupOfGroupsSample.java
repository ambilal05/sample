package testng.groups;

import org.testng.annotations.Test;

public class GroupOfGroupsSample {

	@Test(groups = {"PLPPage", "Regression"})
	public void plp1() {
		System.out.println("PLP Page");
	}
	
	@Test(groups= {"PDPPage", "Regression"})
	public void pdp1() {
		System.out.println("PDP Page");
	}
}
