package testng.attributies;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class InvocationCountAndTimeOut extends BaseClass{

	@Test(invocationCount = 3, invocationTimeOut = 10000) 
	public void jpetLogin() {
		browserOpen("chrome");
		loadUrl("https://petstore.octoperf.com/actions/Catalog.action");
		
		findElementByXpath("//*[text()='Sign In']").click();
		findBy(By.name("username")).sendKeys("j2ee");
		findBy(By.name("signon")).click();
	}
}
