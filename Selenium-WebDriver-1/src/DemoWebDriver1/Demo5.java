package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("http://newtours.demoaut.com/");
		
		WebElement link = fdriver.findElement(By.linkText("Cruises"));
		//Actions
		Actions MH = new Actions(fdriver);
		//Mouse over on Cruise
		Action mouseover = MH.moveToElement(link).build();
		// will move cursor to that element
		mouseover.perform();
		Thread.sleep(3000);
	//	MH.sendKeys(link, (Keys.ENTER)).perform();
		MH.sendKeys(link, (Keys.RETURN)).perform();
				
	}

}
