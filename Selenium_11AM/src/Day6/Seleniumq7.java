package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumq7 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		/* RPA */
		
		WebElement ele = driver.findElement(By.linkText("RPA"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		Robot r=new Robot();
		for(int i=1;i<=6;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_I);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_SHIFT);
//		
//	    r.keyRelease(KeyEvent.VK_I);
						
		
	}

}
