package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.xpath("//li[@class='navlink lnHeight' and @navindex='6']"));
        Actions a=new Actions(driver);
        a.moveToElement(ele);
        WebElement ele1 = driver.findElement(By.xpath("//span[text()='Shirts']"));
        JavascriptExecutor jk=(JavascriptExecutor)driver;
        jk.executeScript("arguments[0].click()","ele2");
        
	}
}