package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src2 = driver.findElement(By.id("credit2"));
		WebElement des2 = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement src = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement des = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(src,des).perform();
		a.dragAndDrop(src2, des2).perform();
		
		WebElement src4 = driver.findElement(By.id("credit1"));
		WebElement des4 = driver.findElement(By.id("loan"));
		WebElement src1 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement des1 = driver.findElement(By.id("amt8"));
		
		a.dragAndDrop(src1,des1).perform();
		a.dragAndDrop(src4, des4).perform();
		
		
	}

}
