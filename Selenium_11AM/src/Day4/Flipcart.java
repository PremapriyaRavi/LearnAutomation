package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    WebElement fele = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		fele.click();
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("laptop");
		ele.sendKeys(Keys.ENTER);
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Login']"));
		ele4.click();
		WebElement ele5 = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		ele5.sendKeys("pinky");
		WebElement ele6 = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		ele6.sendKeys("123");
		String attribute = ele5.getAttribute("value");
		System.out.println(attribute);
		String attribute2 = ele6.getAttribute("value");
		System.out.println(attribute2);
	}

}
