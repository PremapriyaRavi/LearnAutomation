package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCourse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("http://greenstech.in/selenium-course-content.html");
	    driver.manage().window().maximize();
	    WebElement ele = driver.findElement(By.xpath("(//div[@class='card'])[126]/div[@id='heading20']"));
	    ele.click();
	    WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question ')]/preceding-sibling::span"));
	    ele2.click();
	}

}
