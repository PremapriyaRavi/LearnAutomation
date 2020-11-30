package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
//		WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
//		ele.sendKeys("greens velmurugan");
//		//ele.sendKeys(Keys.ENTER);
//		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele2 = driver.findElement(By.xpath("//a[@title='Google apps']"));
		ele2.click();
		
  Robot r=new Robot(); 
  for(int i=1;i<=9;i++) {
	  r.keyPress(KeyEvent.VK_TAB);	
	  r.keyRelease(KeyEvent.VK_TAB);
	  }
	  r.keyPress(KeyEvent.VK_ENTER);	
	  r.keyRelease(KeyEvent.VK_ENTER);

}
} 
             