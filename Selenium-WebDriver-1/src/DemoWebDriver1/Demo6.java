package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
	//	WebDriver fdriver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
	//	driver.findElement(By.id("btnLogin")).click();
		
	/*	WebElement LoginBtn = driver.findElement(By.id("btnLogin"));
		//Actions
		Actions MH = new Actions(driver);
		//Mouse over on LogIn btn
		Action mouseover = MH.moveToElement(LoginBtn).build();
		// will move cursor to that element
		mouseover.perform();
		Thread.sleep(3000);
		MH.sendKeys(LoginBtn, (Keys.ENTER)).perform();											*/
		
		
		//Alternative
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
		Thread.sleep(3000);
		//act.sendKeys(Keys.TAB).perform();	
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		

	}

}
