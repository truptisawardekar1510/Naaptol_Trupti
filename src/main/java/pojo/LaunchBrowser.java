package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static WebDriver openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naaptol.com/");
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
//	public static void main(String[] args) {
//		
//		openBrowser();
//	}
//	
	
	
}
	

