package test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BaseTest;
import pojo.LaunchBrowser;
import pom.AddProductToCartFromQuickView;
import pom.AddTocartPage;
import pom.NaaptolHomePage;
import pom.QuickViewProductPopupPage;
import pom.SearchResultPage;

public class AddToProductFromQuickViewTestPage  extends BaseTest  {
	
	@BeforeMethod
	public void openBroser() {
		driver=LaunchBrowser.openBrowser();
	}
	
	
	@Test
	public void verifyingProductaddedInCartViaquickView () throws InterruptedException {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductsToSearch("perfume");
		naaptolHomePage.clickOnSearchButton();
		
	    SearchResultPage searchResultPage = new SearchResultPage(driver);
	    searchResultPage.moveToDesiredProduct(driver, 0);
	    searchResultPage.clickOnQuickView(0);
	    String Title= searchResultPage.getProductTitle(0);
	    
	    QuickViewProductPopupPage quickviewProductPopupPage = new QuickViewProductPopupPage(driver);
	    quickviewProductPopupPage.enterPincode("695003");
	    quickviewProductPopupPage.clickOnPincodeCheckButton();
	    quickviewProductPopupPage.clickOnClickHereToBuy(driver); // Reached on cart page with adding 1 product
	    
	    Thread.sleep(3000);
	}
	    
	    
	    
	    
	 
	    

	    /* AddTocartPage addTocartPage = new AddTocartPage(driver);
         addTocartPage.clickOnContinueShoppingTopButton(driver);
    	 Thread.sleep(3000); */
	    
//	    
//    addTocartPage.removeProductFromCart(0);
	    
	    

//	    
//	    
//	   
//	    
//	    searchResultPage.moveToDesiredProduct(driver, 1);
//	    searchResultPage.clickOnQuickView(1);
//	    
//	    
//        quickviewProductPopupPage.enterPincode("695003");
//	    quickviewProductPopupPage.clickOnPincodeCheckButton();
//	    quickviewProductPopupPage.clickOnClickHereToBuy(driver);
	    
	    
	    
//	   	    String cartProductTitle = quickviewProductPopupPage.getProductTitlefromQuickViwePopup();
//	   	    
	    
	    
//	    Assert.assertEquals(quickviewProductPopupPage.getProductTitlefromQuickViwePopup(driver), cartProductTitle);
//	    System.out.println("same Title");
	    
	}

	    
	    
	    
	    
	     

	
	
	/*@Test
	
	public void verifyProductPrice() {
	NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
	naaptolHomePage.enterProductsToSearch("cooker");
	naaptolHomePage.clickOnSearchButton();
	
    SearchResultPage searchResultPage = new SearchResultPage(driver);
    searchResultPage.moveToDesiredProduct(driver, 0);
    searchResultPage.clickOnQuickView(0);
    searchResultPage.clickOnClickHereToBuy();
    
    AddProductToCartFromQuickView addProductTocartFromQuickView = new  AddProductToCartFromQuickView(driver);
    String unitprice= addProductTocartFromQuickView.getUnitPrice(driver);
	}
	
}*/
	
	
	
	


