package testng.parameters.dataprovider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParameterSample extends BaseClass{
	
	@Parameters({"driver", "url"})
	@BeforeMethod
	public void launchJPetApp(String brow, String url) {
		browserOpen(brow);
		loadUrl(url);
	}

	@Parameters("User")
	@Test
	public void jpetLogin(String user) {
		
		findElementByXpath("//*[text()='Sign In']").click();
		findBy(By.name("username")).sendKeys(user);
		findBy(By.name("signon")).click();
	}
}
