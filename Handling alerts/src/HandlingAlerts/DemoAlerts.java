package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlerts {
	@Test
	public void TestPopups() throws Exception {

	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	    driver.findElement(By.name("proceed")).click(); // click on Go btn
	    Thread.sleep(5000);

	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());

	    String text = alert.getText();

	    if (text.equals("Please enter a valid user name")) {
	        System.out.println("correct alert mesg");
	    } else {
	        System.out.println("in-correct alert mesg");
	    }

	    alert.accept(); 
	    
	    driver.findElement(By.id("login1")).sendKeys("Prashanth"); 
        driver.findElement(By.id("password")).sendKeys("freddy"); 
    }
	

}
