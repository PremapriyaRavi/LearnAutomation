package Day_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele1 = driver.findElement(By.id("email"));
		WebElement ele2 = driver.findElement(By.id("pass"));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('value','user@123')",ele1);
		jk.executeScript("arguments[0].setAttribute('value','123456')",ele2);
		WebElement ele3 = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()",ele3);
						
	}

}
