package Day_9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.id("currentAddress"));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)",ele);
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='Select State']"));
		a.click(ele2).perform();
		WebElement st = driver.findElement(By.xpath("//div[text()='NCR']"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
		for(int i=0;i<3;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);			
		
	}

}
