package ActiTimeTest;

import org.testng.annotations.Test;

import ActiTimeLib.BaseTest;
import ActiTimePo.ActiTimeHomePagePO;
import ActiTimePo.ActiTimeLoginPO;

public class ActiTimeHomeTest extends BaseTest{
	
	@Test
	public void testLogout() {
		driver.get(TEST_URL);
		ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
		loginPO.login("admin", "manager");	
		ActiTimeHomePagePO homePO=new ActiTimeHomePagePO(driver);
		homePO.checkWebElement(homePO.logoutBtn());
		homePO.logout();
	}
	
	

}
