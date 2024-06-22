package testng.attributies;

import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class AlwaysRun {

//	@Test
//	public void alwaysRun() {
//		
//	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
		int i = 1/0;
	}
	
	@Test(dependsOnMethods="test1", alwaysRun = true)
	public void test2() {
		System.out.println("Test 2");
	}

}
