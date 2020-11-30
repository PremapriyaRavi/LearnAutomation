package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement ele1= driver.findElement(By.id("email"));
	    ele1.sendKeys("user@123");
	    WebElement ele2 = driver.findElement(By.name("pass"));
	    ele2.sendKeys("12345");
	    String attribute = ele1.getAttribute("value");
	    System.out.println(attribute);
	    String attribute2 = ele2.getAttribute("value");
	    System.out.println(attribute2);
	}
}
