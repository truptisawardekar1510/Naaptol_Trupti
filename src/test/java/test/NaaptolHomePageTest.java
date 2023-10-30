package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BaseTest;
import pojo.LaunchBrowser;
import pom.NaaptolHomePage;

public class NaaptolHomePageTest extends BaseTest {
	
	@BeforeMethod
	public void openBroser() {
		driver=LaunchBrowser.openBrowser();
	}
	
	@Test
	
	public void NaaptolLoginTest() throws InterruptedException {
		NaaptolHomePage naaptolHomeaPage = new NaaptolHomePage(driver);
	    naaptolHomeaPage.clickOnLoginOrRegister();
	    naaptolHomeaPage.enterMobileNumber("9561802881");
	    naaptolHomeaPage.clickOnContinue();
	    Thread.sleep(30000);
	    Assert.assertTrue(naaptolHomeaPage.isDisplayedLogout());
	    System.out.println("isDisplayedLogout");
	    Assert.assertEquals(naaptolHomeaPage.getUserName(),"Trupti");
	    System.out.println("NameIsEqual");
        
	    
	    
		
		
		
		
	}
	
	

}
