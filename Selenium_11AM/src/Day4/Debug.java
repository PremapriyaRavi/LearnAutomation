package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement ele1= driver.findElement(By.id("email"));
	    ele1.sendKeys("user@123");
	    WebElement ele2 = driver.findElement(By.name("pass"));
	    ele2.sendKeys("12345");
	    
	    WebElement btnlogin = driver.findElement(By.name("login"));
	    btnlogin.click();
	    //Thread.sleep(2000);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	}

}
