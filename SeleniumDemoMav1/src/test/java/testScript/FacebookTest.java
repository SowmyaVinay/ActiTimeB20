package testScript;

import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;

public class FacebookTest extends BaseTest{
	
	@Test
	public void facebookTest() throws Exception{
		
		driver.get(TEST_URL);
		GooglePagePO googlePO = new GooglePagePO(driver);
		googlePO.searchTxtBx().sendKeys("Facebook.com");
		
		//googlePO.fblink().click();
		Thread.sleep(2000);
		//googlePO.clkBtn().click();
		
			
	}
	
	
	
}
