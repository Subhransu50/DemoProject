package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Two extends Base {
	
public WebDriver driver = null;
	
	@Test
	public void testTwo() {
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()+" by TestTwo");
	
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		driver = initializeBrowser("firefox");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}