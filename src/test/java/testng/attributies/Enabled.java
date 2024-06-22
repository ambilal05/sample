package testng.attributies;

import org.testng.annotations.Test;

public class Enabled {

	@Test(enabled=false)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
