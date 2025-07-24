package com.seleniumBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hollandandbarrett.com");
		String Title= driver.getTitle();
		System.out.println(Title);
		driver.quit();
		
	}

}
