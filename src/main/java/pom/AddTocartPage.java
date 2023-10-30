package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddTocartPage {
	
	@FindBy (xpath="//div[@class='cart_info']//h2")private List<WebElement> productDescription;
	
	@FindBy (xpath="//li[@class=\"head_UPrice\"]")private List<WebElement> unitPrice;
	
	@FindBy (xpath="//li[@class='head_ship']")private List<WebElement> shippingPrice;
	
	@FindBy (xpath="//li[@class='head_Amount']")private List<WebElement> orderAmount;
	
	@FindBy (xpath="(//ul[@id='cartTotal']//label)[1]")private WebElement cartAmount;
	
    @FindBy (xpath="(//a[@class='link_Continue'])[1]")private WebElement continueShoppingTopButton; // (//a[@class='link_Continue'])[1]
    
    @FindBy (xpath="(//a[@class='link_Continue'])[2]")private WebElement continueShoppingDownButton;	
    
    @FindBy(xpath = "//ul[@id='cartTotal']/li[2]/label") private WebElement Giftvoucherdiscount;

   
    @FindBy (xpath="//p[@class='chintu']//a")private List<WebElement> productRemove; // //p[@class='chintu']
   
   
        public AddTocartPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
     }
     
        public String getProductDescription(WebDriver driver,int index) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
	    wait.until(ExpectedConditions.visibilityOf(productDescription.get(index)));
	    return productDescription.get(index).getText();
     }

       
      public int getUnitPriceFromAddToCart(int index) {
	  String unitPriceAddCart= unitPrice.get(index+1).getText().replaceAll("[^0-9]","");
	  int priceUnit=Integer.parseInt(unitPriceAddCart);
	  return priceUnit;
     }

       public int getShippingPriceFromCart(int index) {
	   String shippingPriceAddCart=shippingPrice.get(index+1).getText().replaceAll("[^0-9]","");
	   int priceshipping=Integer.parseInt(shippingPriceAddCart);
	   return priceshipping;
      }
       public int getOrderAmount(int index) {
	   String orderAmountAddcart=orderAmount.get(index+1).getText().replaceAll("[^0-9]", "");
	   int amountOrder=Integer.parseInt(orderAmountAddcart);
	   return amountOrder;
      }
       
        public int  getCartAmount(){
	    String cartAmountaddCart=cartAmount.getText().replaceAll("[^0-9]", "");
	    int amountcart= Integer.parseInt(cartAmountaddCart);
	    return amountcart;
      }

      public void clickOnContinueShoppingTopButton(WebDriver driver) {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	  wait.until(ExpectedConditions.visibilityOf(continueShoppingTopButton));
	  continueShoppingTopButton.click();
      }

      public void clickOnContinueShoppingDownButton(WebDriver driver) {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	  wait.until(ExpectedConditions.visibilityOf(continueShoppingDownButton));
	  continueShoppingDownButton.click();
      }
      
      public int getGiftVoucherDiscount(){
         String gv=Giftvoucherdiscount.getText().replaceAll("[^0-9]", "");
        int giftVoucherdis= Integer.parseInt(gv);
        
        return giftVoucherdis;
      }



     public void removeProductFromCart(int index) {
      productRemove.get(index).click();
      }

  
	
  
	

}
