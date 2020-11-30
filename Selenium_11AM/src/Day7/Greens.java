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

public class Greens {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		TakesScreenshot tk= (TakesScreenshot)driver;
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("(//div[@class='trainer-info'])[8]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", down);
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des=new File("E:\\SelScreenshot\\1stimgae.png");
		FileUtils.copyFile(src, des);
	}

}
