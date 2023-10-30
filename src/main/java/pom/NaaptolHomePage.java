package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolHomePage {
	
	@FindBy (xpath = "//a[@id='login-panel-link']") private WebElement loginOrRegister;
	@FindBy (xpath = "//a[text()='Track Order']") private WebElement trackOrder;
	@FindBy (xpath = "//div[@onmouseover='javascript:menu.showMainMenu(true)']") private WebElement shoppingCategories;
	@FindBy (xpath = "//input[@id='header_search_text']") private WebElement searchBox;
	@FindBy (xpath = "(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]") private WebElement searchButton;
	@FindBy (xpath = "(//a[@id='cart-panel-link'])[2]") private WebElement cartButton;
	@FindBy (xpath = "//input[@id='registration-basic-panel-mobile']") private WebElement mobileNumber;
	@FindBy (xpath = "//input[@id='registration-basic-panel-submit']") private WebElement continueButton;
	@FindBy (xpath = "//div[@class='small_links']//b") private WebElement userName;
	@FindBy (xpath = "(//a[@href='/mobile-apps.html'])[1]") private WebElement downloadApp;
	@FindBy (xpath = "//a[text()='Logout']") private WebElement logout;
	
	
	public NaaptolHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void clickOnLoginOrRegister() {
		loginOrRegister.click();
	}
	
	public void clickOnTrackOrder() {
		trackOrder.click();
	}
	
	public void moveToShoppingCategories(WebDriver driver) {
		Actions actions =new Actions(driver);
		actions.moveToElement(shoppingCategories);
		actions.perform();
	}
	
	public void enterProductsToSearch(String product) {
		searchBox.sendKeys(product);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickOnCart() {
		cartButton.click();
	}
	
	public void enterMobileNumber(String Number) {
		mobileNumber.sendKeys(Number);
		
	}
	
	public void clickOnContinue() {
		continueButton.click();

	}
	
	public String getUserName() {
		return userName.getText();
	}
	
	public void clickOnDownloadApp() {
		downloadApp.click();
	}
	
	public boolean isDisplayedLogout() {
		return logout.isDisplayed();
	}
	
	
		
		
	
	
		
	


}
