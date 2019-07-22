package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("sunil");	
		driver.findElement(By.name("password")).sendKeys("sunil");	
	//	driver.findElement(By.name("login")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
		
		//act.sendKeys(Keys.TAB).perform();	
	//	act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		

	}

}
