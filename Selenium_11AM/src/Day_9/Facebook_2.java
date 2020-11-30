package Day_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++) 
		{
	      WebElement w = op.get(i);	
	     String text = w.getText();
	     
	     s.selectByVisibleText(text);
          System.out.println(text); 
		}
		
		//use this method only for ismultiple method is true
//		List<WebElement> allop = s.getAllSelectedOptions();
//		for(WebElement x:allop)
//		{
//			String text1 = x.getText();
//			System.out.println(text1);
//			
//		}
	}

}
