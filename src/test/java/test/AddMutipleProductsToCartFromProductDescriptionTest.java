package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BaseTest;
import pojo.LaunchBrowser;
import pom.AddProductToCartFromProductDiscriptionPage;
import pom.AddProductToCartFromQuickView;
import pom.AddTocartPage;
import pom.NaaptolHomePage;
import pom.QuickViewProductPopupPage;
import pom.SearchResultPage;

public class AddMutipleProductsToCartFromProductDescriptionTest extends BaseTest{

	@BeforeMethod
	public void openBroser() {
		driver=LaunchBrowser.openBrowser();
	}
	
     @Test 
    public void AddProductTocartFromProductDescriptionTest() throws InterruptedException {
    	 
    		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
    		naaptolHomePage.enterProductsToSearch("mixer");
    		naaptolHomePage.clickOnSearchButton();
    		Thread.sleep(2000);
    		
    		SearchResultPage searchResultPage=new SearchResultPage(driver);
    		searchResultPage.moveToDesiredProduct(driver, 0);
    		String title=searchResultPage.getProductTitle(0);
    		Thread.sleep(2000);
    		System.out.println(title);
    		String mainhandle=driver.getWindowHandle();
    		searchResultPage.clickOnDesiredProduct(0);
    		Thread.sleep(2000);
    	   Set<String>handles= driver.getWindowHandles();
    	   Iterator<String>i=handles.iterator();
    	   while(i.hasNext()) {
    		  String handle= i.next();
    		  driver.switchTo().window(handle);
    		  Thread.sleep(2000);
    		  String currentTitle=driver.getTitle();
    		  System.out.println(currentTitle);
    		  Thread.sleep(2000);
    		  if(currentTitle.contains(title)) {
    			  Thread.sleep(2000);
    			  AddProductToCartFromProductDiscriptionPage addProductToCartFromProductDiscriptionPage =new AddProductToCartFromProductDiscriptionPage(driver);
    			  addProductToCartFromProductDiscriptionPage.clickToBuy(driver);
    			  AddTocartPage addTocartPage = new AddTocartPage(driver);
    			  addTocartPage.clickOnContinueShoppingDownButton(driver);
    			
  
    		  }
    		  driver.switchTo().window(mainhandle);
    		  searchResultPage.moveToDesiredProduct(driver, 2);
    		 String title2= searchResultPage.getProductTitle(2);
    		  System.out.println(title2);
    		  searchResultPage.clickOnDesiredProduct(2);
    		  Set<String>handles2=driver.getWindowHandles();
    		  Iterator<String>j=handles2.iterator();
    		  while(j.hasNext()) {
    			 String handle2= j.next();
    			 driver.switchTo().window(handle2);
    			 Thread.sleep(2000);
    			 String currentTitle2=driver.getTitle();
    			 if(currentTitle2.contains(title2)) {
    				 Thread.sleep(2000);
    				 AddProductToCartFromProductDiscriptionPage addProductToCartFromProductDiscriptionPage =new AddProductToCartFromProductDiscriptionPage(driver);
    				 try {
    					 addProductToCartFromProductDiscriptionPage.clickToSelectColour(driver, 0);
    				 }
    				 catch (Exception e) {
					System.out.println("No element found");
					}
       			    addProductToCartFromProductDiscriptionPage.clickToBuy(driver);
       			    
    			 }
    		  }
    		  
    		  
    		
    		
    		
    	}
    			
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}

	