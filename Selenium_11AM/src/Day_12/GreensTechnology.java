package Day_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://greenstechnologys.com/");
	    WebElement ele = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	    JavascriptExecutor jk=(JavascriptExecutor)driver;
	    jk.executeScript("arguments[0].scrollIntoView(true)",ele);
	    String text = ele.getText();
	    System.out.println(text);
	
	}

}
