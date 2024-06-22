package testng.parameters.dataprovider;

import org.testng.annotations.DataProvider;

public class DiffClassDataProvider {

	@DataProvider(name="UserAndPwd")
	public Object[][] data(){
		return new Object[][] {{"Jothika", "jothi@123"},
							   {"Vivek", "vivek@123"}};
	}
}
