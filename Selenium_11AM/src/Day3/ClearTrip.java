package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.cleartrip.com/trains");
	    driver.manage().window().maximize();
//	    WebElement ele1 = driver.findElement(By.xpath("//input[@title='From station']"));
//	    ele1.sendKeys("chennai");
//	    WebElement ele2 = driver.findElement(By.xpath("//input[@class='autocomplete required keyValue span span24 ui-autocomplete-input ugly selflabel']"));
//	    ele1.sendKeys("thanjavur");
//	    WebElement ele3 = driver.findElement(By.xpath("(//button[@id='trainFormButton'])[1]"));
//	    ele3.click();
	    
	    
	}

}
