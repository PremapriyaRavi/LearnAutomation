

package Day7;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
        WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));  
        ele.sendKeys("iphone");
        ele.sendKeys(Keys.ENTER);
        TakesScreenshot tk=(TakesScreenshot)driver;
        File src = tk.getScreenshotAs(OutputType.FILE);
        System.out.println(src);
	}

}
