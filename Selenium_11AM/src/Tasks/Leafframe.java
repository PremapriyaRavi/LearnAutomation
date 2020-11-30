package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
//		WebElement ele = driver.findElement(By.xpath("//iframe[@src='default.html']"));
//		driver.switchTo().frame(ele);
//		WebElement ele1 = driver.findElement(By.id("Click"));
//		String text = ele1.getText();
//		System.out.println(text);
//		ele1.click();
		
		//WebElement ele2 = driver.findElement(By.id("frame2"));
		WebElement ele2 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(ele2);
		WebElement ele22 = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		driver.switchTo().frame(ele22);
	    WebElement ele3 = driver.findElement(By.id("Click1"));
		String t1 = ele3.getText();
	    System.out.println(t1);
		ele3.click();
		
	
//		List<WebElement> ele= driver.findElements(By.tagName("iframe"));
//		int size = ele.size();
//		
//		System.out.println(size);
		
		
	
		
	}

}
