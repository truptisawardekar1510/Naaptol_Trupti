package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	
	@FindBy (xpath = "//div[@class='grid_Square ']")private List<WebElement> products;
	
	@FindBy (xpath ="//div[@class='item_title']//a") private  List<WebElement> productTitle; /// //div[@class='item_image']//a
	
	@FindBy (xpath = "//div[@class='item_value']") private List<WebElement> productPrice;
	
	@FindBy (xpath = "//a[@href='#QuickView']") private List<WebElement> quickview;
	

	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public int getNumberOfPRoductsAfterSearch() {
		return products.size();		
		}
	
	public void moveToDesiredProduct(WebDriver driver ,int index) {
		Actions actions = new Actions(driver);
		actions.moveToElement(products.get(index));
		actions.perform();
		
	}
	
	public void clickOnQuickView(int index) {
		quickview.get(index).click(); 
	}
	
	public void  clickOnDesiredProduct( int index) {
		products.get(index).click();
	}
	
	public String getProductTitle(int index) {
		return productTitle.get(index).getText();
		
	}
	
	
	
    
     
     
     
	
	
	
	
	
	
	
	

}
