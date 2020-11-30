package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenstechSel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.greenstechnologys.com/");
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		//WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		//a.moveToElement(course).perform();
//		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
//		a.moveToElement(oracle).perform();
//		WebElement Rac = driver.findElement(By.xpath("//span[text()='Oracle RAC Training']"));
//		a.click(Rac).perform();
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(ele).perform();
//		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
//		a.moveToElement(ele2).perform();
//		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
//		a.click(ele3).perform();
		
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		a.moveToElement(ele4).perform();
		WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		a.click(ele5).perform();
		
		
		
	}

}
