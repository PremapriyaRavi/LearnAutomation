package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensPython {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		//Thread.sleep(1000);
//		WebElement ele = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
//		jk.executeScript("arguments[0].click()",ele);
		
		WebElement ele2 = driver.findElement(By.xpath("//h2[text()=' Python Test Papers']")); 
		jk.executeScript("arguments[0].scrollIntoView(true)", ele2);
		WebElement ele1 = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		ele1.click();
		WebElement ele4 = driver.findElement(By.xpath("//section[@id='batches']"));
		ele4.click();
		
		WebElement ele = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
		jk.executeScript("arguments[0].click()",ele);

		WebElement ele3 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		ele3.click();
		WebElement ele5 = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		ele5.click();
	}

}

