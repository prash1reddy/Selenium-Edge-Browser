package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EasyCalculation {
	WebDriver driver;
	@Test
	public void caseStudy() throws Exception{
		driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='googleSearchId']")).click();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//button[@class='search_button'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(@href, 'bangalore')])[1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
