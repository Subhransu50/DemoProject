package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Four extends Base {
	
public WebDriver driver = null;
	
	@Test
	public void testFour() {
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()+" by TestFour");
	
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		driver = initializeBrowser("edge");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
