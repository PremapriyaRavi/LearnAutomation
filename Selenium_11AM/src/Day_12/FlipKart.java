package Day_12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement ele5 = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		ele5.sendKeys("pinky@123");
		//jk.executeScript("arguments[0].setAttribute('value','pinky')",ele5);
		WebElement ele6 = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		ele6.sendKeys("123$#");
		//jk.executeScript("arguments[0].setAttribute('value','pie6789')",ele6);
		WebElement ele7 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		jk.executeScript("arguments[0].click()", ele7);
		Object exe = jk.executeScript("return arguments[0].getAttribute('value')",ele5);
		System.out.println(exe);
		Object exe1 = jk.executeScript("return arguments[0].getAttribute('value')",ele6);
		System.out.println(exe1);
		
	}

}
