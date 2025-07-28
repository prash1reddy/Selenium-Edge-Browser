package ReadExcelData;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import au.com.bytecode.opencsv.CSVReader;
public class DDTCasestudy {
    String CsvPath = "C:\\Excel\\CSVTestData1.csv"; // Replace with your actual CSV file path
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void setup() throws Exception {
    	
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
    }
    @Test
	public void locatorsTestingBlog() throws Exception {
		CSVReader reader = new CSVReader(new FileReader(CsvPath));
		String[] csvCell;
		while ((csvCell = reader.readNext()) != null) {
			String FName = csvCell[0];
			String LName = csvCell[1];
			String Email = csvCell[2];
			String MNumb = csvCell[3];
			String CName = csvCell[4];
			driver.findElement(By.name("FirstName")).sendKeys(FName);
			driver.findElement(By.name("LastName")).sendKeys(LName);
			driver.findElement(By.name("EmailID")).sendKeys(Email);
			driver.findElement(By.name("MobNo")).sendKeys(MNumb);
			driver.findElement(By.name("Company")).sendKeys(CName);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}
		reader.close();
	
}
}