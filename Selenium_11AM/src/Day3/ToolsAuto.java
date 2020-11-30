
package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsAuto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='firstName']"));
		ele1.sendKeys("pinky");
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='lastName']"));
		ele2.sendKeys("R");
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='userEmail']"));
		ele3.sendKeys("user@123");
		WebElement ele4 = driver.findElement(By.xpath("//label[text()='Female']"));
		ele4.click();
		WebElement ele5 = driver.findElement(By.xpath("//input[@id='userNumber']"));
		ele5.sendKeys("1234567898");
		//WebElement ele6 = driver.findElement(By.xpath("//label[text()='Reading']"));
		//ele6.click();
		WebElement ele7 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		ele7.click();
		WebElement ele8 = driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[8]/textarea[@id='currentAddress']"));
		ele8.sendKeys("12,qwerty,56778");
		WebElement ele9 = driver.findElement(By.xpath("//button[text()='Submit']"));
		ele9.click();
		
	}

}