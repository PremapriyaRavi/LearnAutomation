package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("http://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.sendKeys("user@123");
	    WebElement ele2 = driver.findElement(By.id("password"));
	    ele2.sendKeys("123456");
	    String at1 = ele.getAttribute("value");
	    System.out.println(at1);
	    String at2 = ele2.getAttribute("value");
	    System.out.println(at2);
	}

}
