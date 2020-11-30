package Day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
	    ele.sendKeys("Greenstechnology");
	    ele.sendKeys(Keys.ENTER);
	    String title = driver.getTitle();
	    System.out.println(title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);

	}

}
