package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	public synchronized WebDriver initializeBrowser(String browserName) throws MalformedURLException {

		 WebDriver driver = null;

		DesiredCapabilities dc = new DesiredCapabilities();
		String USERNAME = "subhransusekharp2";
		String ACCESS_KEY = "N4ydSzd2khRygVXn2mtV";
		String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
			dc.setCapability("os", "Windows");
			dc.setCapability("os_version", "10");
			

			dc.setCapability("name", "MyFirstTest On BrowserStack");

		if (browserName.equalsIgnoreCase("chrome")) {
			//dc.setCapability("browser", "Chrome");
			
			dc.setBrowserName("chrome");
			dc.setCapability("browser_version", "latest");

		} else if (browserName.equalsIgnoreCase("firefox")) {
			
			dc.setBrowserName("firefox");
			dc.setCapability("browser_version", "latest");

		} else if (browserName.equalsIgnoreCase("edge")) {

			dc.setBrowserName("MicrosoftEdge");
			dc.setCapability("browser_version", "latest");

		} else if (browserName.equalsIgnoreCase("opera")) {

			dc.setBrowserName("opera");

		} else if (browserName.equalsIgnoreCase("ie")) {

			dc.setBrowserName("internet explorer");

		} else if (browserName.equalsIgnoreCase("safari")) {

			dc.setBrowserName("safari");
		}

		//driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);
		driver=new RemoteWebDriver(new URL(URL),dc);

		return driver;

	}

}
