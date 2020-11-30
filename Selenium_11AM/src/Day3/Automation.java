package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	    WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    ele1.sendKeys("pinky");
	    WebElement ele2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    ele2.sendKeys("R");
	    WebElement ele3 = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@ng-model='Adress']"));
	    ele3.sendKeys("123,thanjavaur,612304");
	    
	   WebElement ele5 = driver.findElement(By.xpath("//div[@id='eid']/input[@ng-model='EmailAdress']"));
	    ele5.sendKeys("user@123");
	    WebElement ele6 = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[4]/input[@ng-model='Phone']"));
		ele6.sendKeys("12345677");
		WebElement ele4 = driver.findElement(By.xpath("//input[@id='firstpassword' and @ng-model='Password']"));
	    ele4.sendKeys("1234");
	    WebElement ele8 = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[12]/input[@id='secondpassword']"));
		ele8.sendKeys("1234");
		WebElement ele10 = driver.findElement(By.xpath("//label[text()=' FeMale']"));
		ele10.click();
		WebElement ele11 = driver.findElement(By.id("checkbox1"));
		ele11.click();
		WebElement ele12 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		ele12.click();
		WebElement ele13 = driver.findElement(By.id("checkbox3"));
		ele13.click();
		WebElement ele14 = driver.findElement(By.xpath("//button[@id='submitbtn' and @name='signup']"));
        ele14.click();
  
	}

}
