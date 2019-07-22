package DemoWebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("http://newtours.demoaut.com/");
		
	//	fdriver.findElement(By.xpath("//*[@name='userName']")).sendKeys("sunil");
	//	fdriver.findElement(By.name("userName")).sendKeys("sunil");
	//	fdriver.findElement(By.name("password")).sendKeys("sunil");
	//	fdriver.findElement(By.name("login")).click();
		
		WebElement UserName = fdriver.findElement(By.name("userName"));		
		WebElement Password = fdriver.findElement(By.name("password"));
		WebElement LogInBtn = fdriver.findElement(By.name("login"));
		UserName.sendKeys("sunil");	
		Password.sendKeys("sunil");
		LogInBtn.click();	
		
		Thread.sleep(30000);
		
	//	fdriver.findElement(By.xpath("///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		fdriver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
		fdriver.close();
	}

}
