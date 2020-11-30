package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("nav-link-prime"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		WebElement ele2 = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[4]"));
		a.click(ele2).perform();
				
	}

}
