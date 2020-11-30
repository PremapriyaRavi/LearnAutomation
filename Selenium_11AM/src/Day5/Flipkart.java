package Day5;

import org.openqa.selenium.By;
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
		WebElement fele = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		fele.click();
		
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		WebElement ele2 = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		a.click(ele2).perform();
		//WebElement ele3 = driver.findElement(By.xpath("//a[@class='_2cLu-l' and text()='KETSAAL Terry Cotton 450 GSM Bath Towel']"));
		WebElement ele3 = driver.findElement(By.xpath("(//a[text()='Flipkart']"));
		//String attribute = ele3.getAttribute("title");
		String text = ele3.getText();
		System.out.println(text);
		
		
		
	}

}
