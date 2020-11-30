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

public class Snapdeal {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    
	driver.get("https://www.snapdeal.com/");
    driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.id("inputValEnter"));
    ele.sendKeys("Bags Girls");
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    TakesScreenshot tk=(TakesScreenshot)driver;
    File img = tk.getScreenshotAs(OutputType.FILE);
    System.out.println(img);
    
  
}
}
