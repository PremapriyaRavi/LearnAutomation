package Day_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	WebElement year = driver.findElement(By.id("year"));
	Select s=new Select(year);
	List<WebElement> op = s.getOptions();
	for(int i=0;i<op.size();i++) 
	{
      WebElement w = op.get(i);	
      String att = w.getAttribute("value");
      s.selectByValue(att);
      System.out.println(att);

	}
	
}
}
