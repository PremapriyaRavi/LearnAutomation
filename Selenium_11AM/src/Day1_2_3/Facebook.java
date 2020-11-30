package Day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\geckodriver.exe ");
		//WebDriver driver=new FirefoxDriver();
	    
		//System.setProperty("webdriver.ie.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    WebElement ele1= driver.findElement(By.id("email"));
	    ele1.sendKeys("user@123");
	    String attribute = ele1.getAttribute("placeholder");
	    System.out.println(attribute);
	    String attribute3 = ele1.getAttribute("value");
	    System.out.println(attribute3);
	    WebElement ele2 = driver.findElement(By.name("pass"));
	    ele2.sendKeys("12345");
	    String attribute2 = ele2.getAttribute("placeholder");
	    System.out.println(attribute2);
	    String attribute4 = ele2.getAttribute("value");
	    System.out.println(attribute4);
	    WebElement t1 = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	    String text = t1.getText();
	    System.out.println(text);
	    WebElement t2 = driver.findElement(By.xpath("//h2[contains(text(),'Face')]"));
	    String text2 = t2.getText();
	    System.out.println(text2);
	    WebElement t3 = driver.findElement(By.xpath("//button[@type='submit']"));	
	    t3.click();
	
	}

	}
