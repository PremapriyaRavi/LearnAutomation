package Day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_q8 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		TakesScreenshot tk=(TakesScreenshot)driver;
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.id("heading302"));
		ele.click();
		jk.executeScript("arguments[0].scrollIntoView(true)",ele);
		File img = tk.getScreenshotAs(OutputType.FILE);	
		WebElement ele1 = driver.findElement(By.id("heading20"));
		jk.executeScript("arguments[0].scrollIntoView(false)",ele1);
		ele1.click();
		File img2 = tk.getScreenshotAs(OutputType.FILE);	
//		WebElement ele3 = driver.findElement(By.id("headingOne"));
//		
//		jk.executeScript("arguments[0].scrollIntoView(true)",ele3);
//		ele3.click();
//		File img3 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(img);
		System.out.println(img2);
//  	System.out.println(img3);
		File f=new File("E:\\SelScreenshot\\1stimgae.png");
		FileUtils.copyFile(img,f);
		
		
		
	}

}
