package Day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].click()", ele);
	
        WebElement ele2 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Actions a=new Actions(driver);
		JavascriptExecutor jk1=(JavascriptExecutor)driver;
		jk1.executeScript("arguments[0].click()", ele2);
		
		
		//a.moveToElement(ele2).perform();
		//boolean selected = ele2.isSelected();
		//System.out.println(selected);
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		//ele2.click();	
				
	}	

}
