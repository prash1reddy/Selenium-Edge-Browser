package edgeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\edge\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriver driver1= new EdgeDriver();
		WebDriver driver2= new EdgeDriver();
		WebDriver driver3= new EdgeDriver();
		WebDriver driver4= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver1.get("http://www.bing.com");
		driver2.get("https://demo.opencart.com/");
		driver3.get("https://www.freecrm.com/");
		driver4.get("http://www.half.ebay.com");
	    driver.manage().window().maximize();

	}

}
