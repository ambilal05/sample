package testng.attributies;

import org.testng.annotations.Test;

public class Priority {

	//Which test will execute, if 2 tests are having same priorities -> based on ASCII
	//What will happen, If we didn't declare any priority for @Test
	    //by default, it will make the @Test as 0th priority
	//Can we declare negative numbers on priority? 
	    //yes, we can 
	
	@Test(priority=1)
	public void testdesc() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1)
	public void testa() {
		System.out.println("Test 2");
	}
	
	@Test (priority=3)
	public void testt() {
		System.out.println("Test 3");
	}
	
	@Test (priority=4)
	public void tests() {
		System.out.println("Test 4");
	}
	
	@Test
	public void teste() {
		System.out.println("Test 5");
	}
	
	@Test(priority=-1)
	public void testb() {
		System.out.println("Test 6");
	}
}
