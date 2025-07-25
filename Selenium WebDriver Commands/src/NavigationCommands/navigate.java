package NavigationCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class navigate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.yahoo.com/");
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
	}

}
