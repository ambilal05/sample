package testng.attributies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ThreadPoolSize extends BaseClass{

	@Test(invocationCount = 10, threadPoolSize = 4) 
	public void jpetLogin() {
//		browserOpen("chrome");
//		loadUrl("https://petstore.octoperf.com/actions/Catalog.action");
//		
//		findElementByXpath("//*[text()='Sign In']").click();
//		findBy(By.name("username")).sendKeys("j2ee");
//		findBy(By.name("signon")).click();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("j2ee");
		driver.findElement(By.name("signon")).click();
		driver.close();
	}
}
