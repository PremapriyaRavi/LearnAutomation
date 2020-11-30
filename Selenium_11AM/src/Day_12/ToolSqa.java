package Day_12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//div[text()='Share this page']"));
		je.executeScript("arguments[0].scrollIntoView(true)",down);
		WebElement up = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		je.executeScript("arguments[0].scrollIntoView(false)",up);
		
	}

}
