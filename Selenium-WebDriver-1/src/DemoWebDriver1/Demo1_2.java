package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		FirefoxDriver driver = new FirefoxDriver();

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
	//	WebDriver cdriver = new ChromeDriver();
		//fdriver.open("www.google.com");
		
		driver.manage().window().maximize();
		fdriver.get("https://opensource-demo.orangehrmlive.com/");
/*		
	// Alternate API to open browser	
			//fdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	// Wait	
				//Thread.sleep(3000);
	// Refresh the Webdriver (Navigation Method)	
				//fdriver.navigate().refresh();							*/
		
		String ExpectedTitle = "OrangeHRM";
		fdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		fdriver.findElement(By.name("txtPassword")).sendKeys("admin123");
		fdriver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		String ActualTitle = fdriver.getTitle();
		System.out.println(ActualTitle);
		
		if (ExpectedTitle.equals(ActualTitle))
		{
		fdriver.findElement(By.id("welcome")).click();
		fdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		//This will close one browser opened by instance
		fdriver.close();
		//This will close multiple browser opened by instance
		//fdriver.quit();
		}
		
		else 
		{
			System.out.println("Title validation failed");
			fdriver.quit();
		}
	}

}
