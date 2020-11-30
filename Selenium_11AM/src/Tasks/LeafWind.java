package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafWind {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Open Home Page']"));
//		ele.click();
		
//		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
//		ele1.click();
//		Set<String> allwind = driver.getWindowHandles();
//		int size = allwind.size();
//		System.out.println(size);
		
//		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Do not close me ']"));
//		ele2.click();
//		Set<String> allwind = driver.getWindowHandles();
//		List<String> w=new ArrayList<String>();
//		w.addAll(allwind);
//		System.out.println(w);
//		driver.switchTo().window(w.get(0));
//		driver.close();
		
		WebElement ele3= driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']"));
	    ele3.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
