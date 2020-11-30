package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("iphones X");
		WebElement ele2 = driver.findElement(By.xpath("//input[@value='Go']"));
		ele2.click();
		WebElement fst = driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - Black']"));
		System.out.println(fst.getText());
		fst.click();
		String parent = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		for(String wind:allwind)
			if(!wind.equals(parent))
				driver.switchTo().window(wind);
		
		WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		System.out.println(price.getText());
		
		//driver.findElement(arg0)
//		List<WebElement> allphone=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		allphone.get(0).click();
//	    Set<String> allwind= driver.getWindowHandles();
//	    List<String> w=new ArrayList<String>();
//	    w.addAll(allwind);
//	    driver.switchTo().window(w.get(0));
	    
	    	
	}

}

