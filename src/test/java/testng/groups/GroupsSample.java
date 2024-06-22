package testng.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups = {"Smoke", "Regression", "LoginPage"})
	public void login1() {
		System.out.println("Login 1");
	}
	
	@Test(groups = {"Smoke", "Regression", "LoginPage"})
	public void login2() {
		System.out.println("Login 2");
	}
	
	@Test(groups = {"Sanity", "Regression"})
	public void home1() {
		System.out.println("Home 1");
	}
	
	@Test(groups = {"CartPage", "Regression"})
	public void cart1() {
		System.out.println("Cart 1");
	}
	
	@Test(groups = {"CartPage", "Regression"})
	public void cart2() {
		System.out.println("Cart 2");
	}
}
