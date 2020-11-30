package Day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.homedepot.com/");
	WebElement ele = driver.findElement(By.xpath("//div[@class='SearchBox__inputWrapper']/input[1]"));
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].setAttribute('value','Celling fan')",ele);
	WebElement ele2 = driver.findElement(By.id("headerSearchButton"));
	ele2.click();

	Thread.sleep(2000);		
	WebElement ele3 = driver.findElement(By.xpath("(//a[@class='product-pod--ie-fix'])[1]"));
	jk.executeScript("arguments[0].click()",ele3);
	//ele3.click();
		
		  Set<String> third = driver.getWindowHandles(); 
		  System.out.println(third); 
		  int c=0; 
		  for(String wind:third) 
		  { 
			  if(c==2) 
		  { 
				  driver.switchTo().window(wind);
		  }
		 c++; 
		 }
	Thread.sleep(1000);	 	
	WebElement scrl = driver.findElement(By.xpath("//h2[text()='Specifications']"));
	jk.executeScript("arguments[0].scrollIntoView(true)",scrl);
	WebElement ele4 = driver.findElement(By.xpath("//div[text()='Control Type Included']"));
	ele4.click();
	
	}

}
