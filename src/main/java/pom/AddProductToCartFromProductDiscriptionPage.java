package pom;

	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;
	import java.util.List;

	public class AddProductToCartFromProductDiscriptionPage {
		
	// main product page
	    @FindBy(xpath = "//div[@class='grid_Square ']") private List<WebElement> products; // //div[@id='productItem1'] it get only one product
	    @FindBy(xpath = "//img[@class='square']")       private List<WebElement> DiscriptionProductimage; // //a[@target=\"_blank\"]
	    @FindBy(xpath = "//div[@class='item_title']")   private List<WebElement> ProductTitleDiscription; ////div[@class='item_title']
	    
	   // nextpage
	    
	    @FindBy(xpath="//div[@id='square_Details']//h1")  private WebElement productDescriptionTitle;
		
		@FindBy(xpath="//a[@id='cart-panel-button-0']")private WebElement clickHereToBuy;
		
		@FindBy (xpath = "//a[@class='red_button icon chat']") private WebElement buyButton; ////a[@class='red_button icon chat']
		
		@FindBy(xpath="//input[@id=\"pincodeDeliveryId_0\"]")private WebElement pincode;
		
		@FindBy(xpath="//div[@id=\"pincodeForDeliveryDiv_provide_0\"]/a/span")private WebElement checkPincode;
		
        @FindBy(xpath="//ul[@id='color_box_0']//a")private List<WebElement> colour;



 public AddProductToCartFromProductDiscriptionPage(WebDriver driver){
	        PageFactory.initElements(driver,this);
 }
	   

	    public void moveToDesiredProduct(WebDriver driver, int index){
	        Actions actions=new Actions(driver);
	        actions.moveToElement(products.get(index));
	        actions.perform();
	    }
	    public void clickOnDesiredProduct(int index){
	        products.get(index).click();
	    }
	    public void clickOnDiscriptionProductTitle(int index){
	        DiscriptionProductimage.get(index).click();
	    }
	    public String getProductTitleFromDiscription(WebDriver driver,int index){
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
	        wait.until(ExpectedConditions.visibilityOf(ProductTitleDiscription.get(index)));
	        return ProductTitleDiscription.get(index).getText();
	    }
	    
		public String productDescriptionTitle()
		{
			return productDescriptionTitle.getText();
		}
		
		public void clickOnclickHereToBuy()
		{
			 clickHereToBuy.click();
		}
		
		public void enterPincode(String pincode1)
		{
			pincode.sendKeys(pincode1);
		}

		public void toCheckcheckpincode()
		{
			checkPincode.click();
		}
		
		public void clickToBuy(WebDriver driver) {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(5000));
			wait.until(ExpectedConditions.visibilityOf(buyButton));
			buyButton.click();
		}
		
		public void clickToSelectColour(WebDriver driver,int index) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
			wait.until(ExpectedConditions.visibilityOfAllElements(colour));
			colour.get(index).click();
		}
		



	    }



