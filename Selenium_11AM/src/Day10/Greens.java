package Day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Python']/parent::a"));
		a.click(ele1).perform();
		Thread.sleep(1000);
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		
	    WebElement scrl = driver.findElement(By.xpath("//div[@class='row masterprgmCourse m-0 my-4 p-3']"));
	    jk.executeScript("arguments[0].scrollIntoView(true)",scrl);
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Explore Curriculum']"));
        a.contextClick(ele2).perform();
        Thread.sleep(1000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
	}

}
