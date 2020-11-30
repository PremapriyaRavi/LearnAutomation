package Day_12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.id("username"));
	    JavascriptExecutor jk=(JavascriptExecutor)driver;
	    jk.executeScript("arguments[0].setAttribute('value','user@134')",ele1);
	    WebElement ele2 = driver.findElement(By.id("password"));
	    jk.executeScript("arguments[0].setAttribute('value','123456')", ele2);
	    WebElement ele3=driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()",ele3);
	}

}
