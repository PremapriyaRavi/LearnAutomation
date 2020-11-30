package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.greenstechnologys.com/");
	WebElement ele = driver.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));
	
	Actions a=new Actions(driver);
	Robot r=new Robot();
    a.doubleClick(ele).perform();
	a.contextClick(ele).perform();
	/* print */
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_P);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	r.keyRelease(KeyEvent.VK_P);
	
}
}
