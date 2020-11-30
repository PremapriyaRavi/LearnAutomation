package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class FacebookExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.id("email"));
        //txtEmail.sendKeys("selenium");
		Actions a=new Actions(driver);
		//a.doubleClick(txtEmail).perform();
		//a.contextClick(txtEmail).perform();
//		Actions keyDown = a.keyDown(txtEmail, Keys.SHIFT);
//		Actions sendKeys = keyDown.sendKeys(txtEmail, "selenium");
//		sendKeys.keyUp(txtEmail, Keys.SHIFT).perform();
        
		a.keyDown(txtEmail,Keys.SHIFT).sendKeys(txtEmail, "selenIum").keyUp(txtEmail, Keys.SHIFT).perform();
	}

}
