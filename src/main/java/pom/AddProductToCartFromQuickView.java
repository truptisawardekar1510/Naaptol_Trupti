package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductToCartFromQuickView {
	
	@FindBy  (xpath = "//ul[@id='cartData']") private WebElement itemDetails;
	
    @FindBy  (xpath = "//ul[@id=\"cartData\"]/li[3]") private WebElement unitPrice;
    
    @FindBy  (xpath = "//ul[@id=\"cartData\"]/li[4]") private WebElement shipping;
    
    @FindBy  (xpath = "//ul[@id=\"cartData\"]/li[5]") private WebElement orderAmount;
    
    @FindBy  (xpath = "(//a[@onclick='cart.continueShopping()'])[1]") private WebElement continueShopping;
    
    @FindBy  (xpath = "//ul[@id=\"shopCartHead\"]/li[2]/a[2]") private WebElement proceedToCheckout;

    
    @FindBy(xpath = "//ul[@id=\"cartData\"]/li[1]/div[2]/p[3]/a") private WebElement remove;

    
    
    public AddProductToCartFromQuickView(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    
    
    public String getcartItemsTitle(WebDriver driver){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
            wait.until(ExpectedConditions.visibilityOf(itemDetails));
           return itemDetails.getText();
    }
    
    public String getUnitPrice(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(unitPrice));
       return unitPrice.getText();
       
    }
    
    public String getShippingPrice() {
    	return shipping.getText();
    	
    }
    
    public String getOrderAmount(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(orderAmount));
       return orderAmount.getText();
       
    }
    
    
    public void clickOnContinueShopping() {
    	continueShopping.click();
    	
    }
    

     public void ClickOnRemoveProduct(WebDriver driver){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
         wait.until(ExpectedConditions.visibilityOf(remove));
         remove.click();
}
     
     

    	
    }
    
    
    
    
    
    
    

    




