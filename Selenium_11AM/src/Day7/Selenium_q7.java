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

public class Selenium_q7 {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//div[@id='heading20']"));
		ele.click();
	    JavascriptExecutor je=(JavascriptExecutor)driver;
	    WebElement ele2 = driver.findElement(By.id("heading8811"));
	    je.executeScript("arguments[0].scrollIntoView(true)",ele2);
	    
		Thread.sleep(1000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des=new File("E:\\SelScreenshot\\1stimgae.png");
		FileUtils.copyFile(src, des);
		
		
		//String src = tk.getScreenshotAs(OutputType.BASE64);
		//System.out.println(src);
//		byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
//		System.out.println(bs);

	}

}
