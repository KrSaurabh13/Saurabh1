package DemoWebDriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork_CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.manage().window().maximize();
		fdriver.get("http://newtours.demoaut.com/");
				
		List<WebElement> links = fdriver.findElements(By.tagName("a"));
		 
/*		 System.out.println(links.size());		 
		 for (int i = 1; i<=links.size(); i=i+1)		 
		 {		 
		 System.out.println("WebElements : " +links.get(i).getText());		 
		 }																									*/
		
		 String underconstitle = "Under Construction: Mercury Tours";
		 
		 String[] linktext = new String[links.size()];
		 int i=0;
		 for (WebElement e:links)
		 {
			 linktext[i] = e.getText();
			 i++;			 
		 }
		 
		 for (String t:linktext)
		 {
			 fdriver.findElement(By.linkText(t)).click();
			 Thread.sleep(2000);
			 if(fdriver.getTitle().equals(underconstitle))
			 {
				 System.out.println("\"" + t + "\" is UnderConstruction");
				
			 }
			 else
			 {
				 System.out.println("\"" + t + "\" is Working");
			 }
			fdriver.navigate().back();
		//	fdriver.navigate().
		 }
		fdriver.close();
	}

}
