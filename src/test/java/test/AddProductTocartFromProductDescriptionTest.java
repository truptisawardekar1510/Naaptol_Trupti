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

public class AddProductTocartFromProductDescriptionTest  extends BaseTest {
	
	
	@BeforeMethod
	public void openBroser() {
		driver=LaunchBrowser.openBrowser();
	}
	
	
	@Test 
	
	public void AddProductTocartFromProductDescriptionTest() throws InterruptedException {
		
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductsToSearch("mixer");
		naaptolHomePage.clickOnSearchButton();
		
		SearchResultPage searchResultPage=new SearchResultPage(driver);
		searchResultPage.moveToDesiredProduct(driver, 0);
		searchResultPage.clickOnDesiredProduct(0);
		
		String Title=searchResultPage.getProductTitle(0);
		System.out.println(Title);
		Set<String>handles=driver.getWindowHandles();	
		Iterator<String>i= handles.iterator();
		
		while(i.hasNext()) {
			String handle=i.next()	;	
			driver.switchTo().window(handle);
			
		    String currentTitle=driver.getTitle();
		    System.out.println(currentTitle);
		
			
			if(currentTitle.contains(Title)) {
				QuickViewProductPopupPage quickViewProductPopupPage=new QuickViewProductPopupPage(driver);
				quickViewProductPopupPage.enterPincode("695003");
				quickViewProductPopupPage.clickOnPincodeCheckButton();
				quickViewProductPopupPage.clickOnClickHereToBuy(driver);
			}
			
			//If we want to remove product
			
			/*Thread.sleep(3000);
			AddTocartPage addTocartPage=new AddTocartPage(driver);
			addTocartPage.removeProductFromCart(0);*/

		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
		
	}
		
		
	
		
		
		
		
		
		
	
	
	
	


