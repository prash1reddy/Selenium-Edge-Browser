package edgeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy {
	 public static void main(String[] args) {

	        System.setProperty("webdriver.edge.driver", "C:\\edge\\msedgedriver.exe");
	        WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        System.out.println(driver.getPageSource());

	        driver.get("https://demo.opencart.com/");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        System.out.println(driver.getPageSource());

	        driver.get("http://www.bing.com");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        System.out.println(driver.getPageSource());

	        driver.get("https://www.freecrm.com/");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        System.out.println(driver.getPageSource());
	        
	        driver.get("http://www.half.ebay.com");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        System.out.println(driver.getPageSource());

	        driver.quit();
	 }
}
