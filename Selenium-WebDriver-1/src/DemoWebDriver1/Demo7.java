package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://retail.upskills.in/admin/");
			
			driver.findElement(By.xpath("//*[@id='input-username']")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("admin@123");
			Thread.sleep(2000);
	//		driver.findElement(By.id("btnLogin")).click();
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();	
			Thread.sleep(3000);
			driver.findElement(By.id("menu-catalog")).click();
			
			
			
		
	}

}
