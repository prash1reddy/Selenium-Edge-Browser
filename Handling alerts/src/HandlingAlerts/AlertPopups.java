package HandlingAlerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPopups {
	@Test
	public void TestPopups() throws Exception{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Alert')]")).click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(8000);
		alert.accept();
		
		String result = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result);
        Assert.assertEquals("You successfully clicked an alert", result);
        
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(8000);
        alert2.dismiss();
        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals("You clicked: Cancel", result2);
     
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Alert alertPrompt = driver.switchTo().alert();
        Thread.sleep(8000);
        alertPrompt.sendKeys("Prashanth");
        alertPrompt.accept();
        String resultPrompt = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(resultPrompt);
        Assert.assertEquals("You entered: Prashanth", resultPrompt);

        Thread.sleep(8000);
        
        driver.quit();
	}
}
