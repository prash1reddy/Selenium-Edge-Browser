package radioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EaseMyTripTest {
	
	@Test
	public void NoOfRadioTest() throws Exception{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		int radioBtn= driver.findElements(By.xpath("//input[@type='radio']")).size();
		
		for (int i = 0; i < radioButtons.size(); i++) {
            WebElement radio = radioButtons.get(i);
            radio.click();
            Thread.sleep(1500);
            String label = radio.getAttribute("value");
            if (label == null || label.isEmpty()) {
                label = radio.getAttribute("id");
            }

            System.out.println("Clicked radio button " + (i + 1) + ": " + label);
        }
		System.out.println("No.of Radio Buttons...."+ radioBtn);
	}
	
}
