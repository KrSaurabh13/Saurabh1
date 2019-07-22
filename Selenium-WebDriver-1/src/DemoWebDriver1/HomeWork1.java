package DemoWebDriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("http://newtours.demoaut.com/");
				
		List<WebElement> links = fdriver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)		 
		 {		 
		 System.out.println("WebElements : " +links.get(i).getText());		 
		 }
		
		
	}

}
