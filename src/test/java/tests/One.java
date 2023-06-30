package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class One extends Base {
	
	public WebDriver driver = null;
	
	@Test
	public void testOne() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()+" by TestOne");
	
	}
	@Test
	public void testOneGoogle() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()+" by TestOneGoogles");
	
	}
	@Test
	public void testOneYoutube() {
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()+" by TestOneYoutubes");
	
	}
	
	@BeforeMethod
	public synchronized void setup() throws MalformedURLException {
		
		driver = initializeBrowser("chrome");
		
	}
	
	@AfterMethod
	public synchronized void tearDown() {
		
		driver.quit();
		
	}

}