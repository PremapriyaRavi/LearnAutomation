package Day7;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement fele = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		fele.click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(ele).perform();
		WebElement ele3 = driver.findElement(By.xpath("//a[@title='Remote Control Toys']"));
	    a.click(ele3).perform();
	    TakesScreenshot tk=(TakesScreenshot)driver;
        File src = tk.getScreenshotAs(OutputType.FILE);
        System.out.println(src);
	}

}
