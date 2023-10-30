package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BaseTest;
import pojo.LaunchBrowser;
import pom.AddTocartPage;
import pom.NaaptolHomePage;
import pom.QuickViewProductPopupPage;
import pom.SearchResultPage;

public class AddMutipleProductsFromQuickViewTest extends BaseTest {
	
	@BeforeMethod
	public void openBroser() {
		driver=LaunchBrowser.openBrowser();
	}
	
	   @Test
			public void verifyingMultipleProductaddedInCartViaquickView () throws InterruptedException {
				NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
				naaptolHomePage.enterProductsToSearch("cooker");
				naaptolHomePage.clickOnSearchButton();
				
			    SearchResultPage searchResultPage = new SearchResultPage(driver);
			    searchResultPage.moveToDesiredProduct(driver, 1);
			    searchResultPage.clickOnQuickView(1);
			    String Title= searchResultPage.getProductTitle(1);
			    
			    Thread.sleep(3000);
			    
			    QuickViewProductPopupPage quickviewProductPopupPage = new QuickViewProductPopupPage(driver);
			    quickviewProductPopupPage.enterPincode("695003");
			    quickviewProductPopupPage.clickOnPincodeCheckButton();
			    quickviewProductPopupPage.clickOnClickHereToBuy(driver);
			    
			    Thread.sleep(3000);
			    
	   
			    
			   AddTocartPage addTocartPage = new AddTocartPage(driver);
			    addTocartPage.clickOnContinueShoppingDownButton(driver);
	   
			    
			  
			    searchResultPage.moveToDesiredProduct(driver, 2);
			    
			    Thread.sleep(2000);
			    searchResultPage.clickOnQuickView(2);
			    String Title1= searchResultPage.getProductTitle(2);
			    
	            Thread.sleep(3000);
	   
			    
//	
//			    quickviewProductPopupPage.enterPincode("695003");
//			    quickviewProductPopupPage.clickOnPincodeCheckButton();
			    quickviewProductPopupPage.clickOnClickHereToBuy(driver);  
			    
			    

	   }
}
