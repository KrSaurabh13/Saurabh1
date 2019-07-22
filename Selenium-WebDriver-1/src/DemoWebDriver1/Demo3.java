package DemoWebDriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(3000);
		fdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		fdriver.findElement(By.name("txtPassword")).sendKeys("admin123");
		fdriver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
//		fdriver.findElement(By.linkText("Performance")).click();
		fdriver.findElement(By.id("menu__Performance")).click();
		
		List<WebElement> links = fdriver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println("WebElements : " +links.get(i).getText());
		 
		 }
		 
		

	}

}
