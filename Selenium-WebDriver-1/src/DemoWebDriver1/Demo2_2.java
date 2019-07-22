package DemoWebDriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("http://newtours.demoaut.com/");
				
		WebElement UserName = fdriver.findElement(By.name("userName"));		
		WebElement Password = fdriver.findElement(By.name("password"));
		WebElement LogInBtn = fdriver.findElement(By.name("login"));
		
		if(UserName.isEnabled())
		{
		UserName.sendKeys("sunil");	
		
		}
		
		if(UserName.isDisplayed())
		{
			String UN = UserName.getAttribute("value");
			System.out.println(UN);			
		}
		
		Password.sendKeys("sunil");
		LogInBtn.click();			
		Thread.sleep(30000);
		
		fdriver.findElement(By.xpath("//*[@name='tripType'and @value='oneway']")).click();
		
		WebElement DD = fdriver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> options = sel.getOptions();
		System.out.println("No of Passenger options : " + options.size());
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println("Value of Passenger Dropdown : ");
			System.out.println(" " +options.get(i).getText());
		}
		
			
		sel.selectByValue("2");
		String PassengerVal = DD.getAttribute("value");
		System.out.println(PassengerVal);	
		Thread.sleep(3000);
		sel.selectByVisibleText("1");
		Thread.sleep(3000);
		sel.selectByIndex(3);
		
		fdriver.findElement(By.xpath("//*[@name='servClass'and @value='Business']")).click();
		fdriver.findElement(By.name("findFlights")).click();
//		fdriver.findElement(By.linkText("SIGN-OFF")).click();
//		Thread.sleep(3000);
//		fdriver.close();
	}

}
