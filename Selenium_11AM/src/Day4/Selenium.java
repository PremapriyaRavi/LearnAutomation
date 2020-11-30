package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
		//WebElement ele = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));

		//String text = ele.getText();	
	    //System.out.println(text);
		WebElement ele = driver.findElement(By.xpath("//span[@title='Trainer']"));
		ele.click();
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='col-lg-7']"));
		String text = ele2.getText();
		System.out.println(text);
		WebElement ele5 = driver.findElement(By.xpath("(//div[@class='col-lg-7'])/p[3]"));
		String text2 = ele5.getText();
		System.out.println(text2);
	}

}
