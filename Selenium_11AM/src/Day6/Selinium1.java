package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selinium1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//div[@id='heading20']"));
		ele.click();
		WebElement ele2 = driver.findElement(By.xpath("//span[@class='fas fa-arrow-right']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele2).perform();
		a.contextClick(ele2).perform();
		//Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		for(int i=1;i<=5;i++) {
//			  r.keyPress(KeyEvent.VK_TAB);	
//			  r.keyRelease(KeyEvent.VK_TAB);
//			  }
//			  r.keyPress(KeyEvent.VK_ENTER);	
//			  r.keyRelease(KeyEvent.VK_ENTER);
//		
	}

}
