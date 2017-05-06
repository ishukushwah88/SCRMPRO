package scrmpro.common.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import scrmpro.pom.com.LoginPage;
import scrmpro.reposrity.com.Property;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connectivity implements Property {
	
	public static WebDriver driver =null;

	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty(ChromeDriver, ChromePath);
		driver = new ChromeDriver();
		driver.get(WebSiteUrl);
		driver.manage().window().maximize();
		new LoginPage(driver);
	}
		

}
