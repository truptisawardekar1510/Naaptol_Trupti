package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuickViewProductPopupPage {
	
	
	@FindBy (xpath = "//div[@id='square_Details']//h1") private WebElement quickViewProductTitle; 
	
	@FindBy (xpath = "//li[@id='productPriceDisplay']") private List<WebElement> productPrice; // //li[@id='productPriceDisplay']
	
	@FindBy (xpath = "//span[@class='ship-price']") private WebElement shippingPrice;
	
	@FindBy (xpath = "//a[@id='cart-panel-button-0']") private WebElement   clickHereToBuy;
	
	@FindBy (xpath = "//input[@id='pincodeDeliveryId_0']") private WebElement enterPincode; // //input[@class='inputField_new checkPin']
	
	@FindBy (xpath = "//div [@id='pincodeForDeliveryDiv_provide_0']/a/span") private WebElement clickCheckButton;
	

	
	
	public QuickViewProductPopupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
//	 public String  getProductTitleFromquickViewTab(WebDriver driver) {
//    	 
//	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000) );
//	    	wait.until(ExpectedConditions.visibilityOf(quickViewProductTitle));
//	    	return quickViewProductTitle.getText();
//		}
	
	
	public String  getProductTitlefromQuickViwePopup(WebDriver driver) {
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(quickViewProductTitle));
		return quickViewProductTitle.getText();
	}
	
	   
	     
	     
	     public void clickOnClickHereToBuy(WebDriver driver) {
	    	 
	    	 WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(5000));
	    	 wait.until(ExpectedConditions.visibilityOf(clickHereToBuy));
	    	 clickHereToBuy.click();
	     }
	     
	     
	     public void enterPincode(String pincode) {
	    	 enterPincode.sendKeys(pincode); 
	     }
	     
	     public void clickOnPincodeCheckButton() {
	    	 clickCheckButton.click();
	    	 
	     }


}


