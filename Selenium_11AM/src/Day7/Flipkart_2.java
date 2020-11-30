package Day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Robot r=new Robot();
		WebElement fele = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		fele.click();
		WebElement ele2 = driver.findElement(By.name("q"));
		a.moveToElement(ele2).perform();
		a.click(ele2).perform();
		ele2.sendKeys("iphone");
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        TakesScreenshot tk =(TakesScreenshot)driver;
        File img = tk.getScreenshotAs(OutputType.FILE);
        System.out.println(img);	
		
	}
}