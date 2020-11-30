package Day1_2_3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swiggy {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	    driver.manage().window().maximize();
	    WebElement ele = driver.findElement(By.xpath("//input[@id='location']"));
	    ele.sendKeys("Thanjavur,india");
	    //WebElement ele1 = driver.findElement(By.xpath("(//span[@class='_2W-T9'])[2]"));
	    
//	    Actions a=new Actions(driver);
//	    a.moveToElement(ele1);
//	    a.click(ele1).perform();
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	   
	    String title = driver.getTitle();
	    System.out.println(title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
		
	}

}
