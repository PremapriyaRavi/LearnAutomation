package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		WebElement all= driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
		Actions a=new Actions(driver);
		a.moveToElement(all).perform();
		//Thread.sleep(2000);
		WebElement heat = driver.findElement(By.xpath("//a[@title='Heating & Cooling']"));
		a.moveToElement(heat).perform();
		//Thread.sleep(2000);
		WebElement air = driver.findElement(By.linkText("Air Conditioners"));
		a.moveToElement(air).perform();
		//Thread.sleep(2000);
		WebElement port = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		a.click(port).perform();
		
		
		
		
		
		
	}

}
