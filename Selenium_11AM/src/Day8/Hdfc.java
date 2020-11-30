package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(ele);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("user@123");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		driver.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("12345");
	}

}
