package seleniumGridPackage;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class GridTest2 {
    @Test 
    public void homePageCheck() throws MalformedURLException, URISyntaxException {
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setBrowserName("firefox");
    	WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.10:4444").toURL(), cap);
    	MutableCapabilities options = new ChromeOptions(); // new way of setting capabilities instead of desiredCpabitilites.
    	//WebDriver driver = new RemoteWebDriver(new URI("\"http://192.168.0.10:4444\"").toURL(),options);
    	driver.get("http://google.com");
    	System.out.println(driver.getTitle());
    	
    }
}
