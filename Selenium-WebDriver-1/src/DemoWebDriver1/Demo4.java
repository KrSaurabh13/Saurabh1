package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("http://newtours.demoaut.com/");
		
		fdriver.findElement(By.linkText("Cruises")).click();
		Thread.sleep(2000);
		
		fdriver.navigate().back();
		Thread.sleep(2000);
		fdriver.navigate().forward();
		Thread.sleep(2000);
		fdriver.navigate().refresh();
		Thread.sleep(2000);
		
		fdriver.close();
	}

}
