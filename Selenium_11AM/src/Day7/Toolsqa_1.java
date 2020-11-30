package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		je.executeScript("arguments[0].scrollIntoView(true)",down);
		
	}

}
