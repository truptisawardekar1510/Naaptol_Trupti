package test;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BaseTest;
import pojo.LaunchBrowser;
import pom.AddTocartPage;
import pom.NaaptolHomePage;
import pom.QuickViewProductPopupPage;
import pom.SearchResultPage;

public class ToVerifyAmountFromQuickView extends BaseTest{
	
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
			    
			    
			    //Calcuation
			    Thread.sleep(3000);
			    
			    int am=addTocartPage.getCartAmount();
			    
			    System.out.println(am);
			    System.out.println(addTocartPage.getGiftVoucherDiscount());
			    System.out.println(addTocartPage.getOrderAmount(1));
			    System.out.println(addTocartPage.getShippingPriceFromCart(1));
			    System.out.println(addTocartPage.getUnitPriceFromAddToCart(1));
			    
			    int oa=addTocartPage.getOrderAmount(0);
			    int gv=addTocartPage.getGiftVoucherDiscount();
			    int sp=addTocartPage.getShippingPriceFromCart(0);
			    int up=addTocartPage.getUnitPriceFromAddToCart(0);
			    
			    int expectedorderAmount=up+sp;
			    Assert.assertEquals(expectedorderAmount, oa);
			    
			    int oa2=addTocartPage.getOrderAmount(0);
			   
			    int sp2=addTocartPage.getShippingPriceFromCart(0);
			    int up2=addTocartPage.getUnitPriceFromAddToCart(0);
			    
			    int expectedorderAmount2=up+sp;
			    Assert.assertEquals(expectedorderAmount2, oa2);
			    
			    
			    
			    
			    
			    
			    
			    

	   }

}
