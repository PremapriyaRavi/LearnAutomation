package Day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop {
  public static void main(String[] args) throws AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.shopclues.com/");
	 
	  
	  Actions a=new Actions(driver);
	  
	  Robot r=new Robot();
	  
	  WebElement fst = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	  a.moveToElement(fst).perform();
	  //WebElement ele2 = driver.findElement(By.xpath("//strong[text()='Diet Nutrition']"));
	  //a.moveToElement(ele2).perform();
	  WebElement sec = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	  sec.click();
	
}

}