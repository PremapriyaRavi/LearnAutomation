package Day1_2_3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("http://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    WebElement ele = driver.findElement(By.xpath("//input[@id='imagesrc']"));
	    Actions a=new Actions(driver);
	    a.click(ele).perform();
	    String file="C:\\Users\\PREMA\\Downloads\\hello.txt";
	    StringSelection s=new StringSelection(file);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	}

}
