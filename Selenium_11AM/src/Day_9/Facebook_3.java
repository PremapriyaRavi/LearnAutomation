package Day_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i<op.size(); i++) {
			if(i%2==0) {
			WebElement w = op.get(i);
			String text = w.getText();
			System.out.println(text);
			}
		}
	}

}
