package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
	
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
	//	WebDriver cdriver = new ChromeDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("https://opensource-demo.orangehrmlive.com/");
/*		
	// Alternate API to open browser	
			//fdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	// Wait	
				//Thread.sleep(3000);
	// Refresh the Webdriver (Navigation Method)	
				//fdriver.navigate().refresh();							*/
		
		fdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		fdriver.findElement(By.name("txtPassword")).sendKeys("admin123");
		fdriver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		fdriver.findElement(By.id("welcome")).click();
		fdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}

}
