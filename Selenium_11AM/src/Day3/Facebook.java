package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement ele1= driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[1]"));
	    ele1.sendKeys("user@123");
	    WebElement ele2 = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]"));
	    ele2.sendKeys("12345");
	    WebElement btnlogn = driver.findElement(By.xpath("//button[@name='login']"));
	    btnlogn.click();

	}

}
