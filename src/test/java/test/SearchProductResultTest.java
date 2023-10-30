package test;



import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BaseTest;
import pojo.LaunchBrowser;
import pom.NaaptolHomePage;
import pom.QuickViewProductPopupPage;
import pom.SearchResultPage;

public class SearchProductResultTest extends BaseTest{
	
	@BeforeMethod
	public void openBroser() {
		driver=LaunchBrowser.openBrowser();
	}
	
	@Test
	public void productSearchTest() {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductsToSearch("cooker");
		naaptolHomePage.clickOnSearchButton();
		
	    SearchResultPage searchResultPage = new SearchResultPage(driver);
	    int products=searchResultPage.getNumberOfPRoductsAfterSearch();
	    Assert.assertTrue(products>0);
	    System.out.println("productDisplayedMorethan0");
	    Assert.assertTrue(driver.getTitle().contains("cooker"));
	    }
	
	@Test
	public void verifyIfProductIsVisibleInQuickViewTab() {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductsToSearch("cooker");
        SearchResultPage searchResultPage = new SearchResultPage(driver);
//        searchResultPage.moveToDesiredProduct(driver, 0);
	       naaptolHomePage.clickOnSearchButton();
		
	   
	    String title= searchResultPage.getProductTitle(1);
	    searchResultPage.moveToDesiredProduct(driver, 1);
	    searchResultPage.clickOnQuickView(1);
	    
	    QuickViewProductPopupPage quickViewProcuctPopupPage = new QuickViewProductPopupPage(driver);
	    
	    String QuickViewTitle= quickViewProcuctPopupPage.getProductTitlefromQuickViwePopup(driver);
	    Assert.assertTrue(QuickViewTitle.contains(title));
	    
	    quickViewProcuctPopupPage.enterPincode("416112");
	    quickViewProcuctPopupPage.clickOnPincodeCheckButton();
	    quickViewProcuctPopupPage.clickOnClickHereToBuy(driver);
	    
	    
	    
		
	}

}
