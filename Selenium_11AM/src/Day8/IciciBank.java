package Day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IciciBank {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		WebElement ele1 = driver.findElement(By.id("DUMMY1"));
		ele1.click();
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='labelColumn']/input[@class='login-input type_UserPrincipal']"));
		ele.sendKeys("user@123");
		
		driver.findElement(By.xpath("//input[@class='login-input-password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@id='HDisplay1.Rb20.C2'])/input[@class='cta']")).click();
	}

}
