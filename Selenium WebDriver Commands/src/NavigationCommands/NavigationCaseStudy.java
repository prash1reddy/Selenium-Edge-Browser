package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCaseStudy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String URL= driver.getCurrentUrl();
		System.out.println("Currently in "+URL);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		URL= driver.getCurrentUrl();
		System.out.println("Navigated to "+URL);
		
		driver.navigate().back();
		URL= driver.getCurrentUrl();
		System.out.println("Navigated back to "+URL);
		
		driver.navigate().forward();
		URL= driver.getCurrentUrl();
		System.out.println("Navigate forward to "+URL);
		
		driver.navigate().refresh();
		URL= driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		driver.getPageSource();
		URL= driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
		
		
	}

}
