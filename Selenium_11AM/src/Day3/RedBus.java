package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.redbus.com/");
	    driver.manage().window().maximize();
	    //WebElement ele1 = driver.findElement(By.xpath("//div[@class='hid-config-sign hide']"));
		//ele1.click();
	}

}
