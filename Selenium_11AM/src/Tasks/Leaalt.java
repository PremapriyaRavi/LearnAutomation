package Tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaalt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		//		WebElement ele = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		//		ele.click();
		//	    Alert a1 = driver.switchTo().alert();
		//	    String text = a1.getText();
		//	    System.out.println(text);
		//	    a1.accept();
		System.out.println("===============");
		//	    WebElement ele1 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		//	    ele1.click();
		//	    Alert a2 = driver.switchTo().alert();
		//	    String text2 = a2.getText();
		//	    System.out.println(text2);
		//	    a2.dismiss();
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		ele2.click();
		Alert a3 = driver.switchTo().alert();
		//Thread.sleep(1000);
		a3.sendKeys("This is priya");
		Thread.sleep(5000);
//		String text3 = a3.getText();
//		System.out.println(text3);
		a3.accept();
		WebElement ele3 = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
		ele3.click();
		Alert a4 = driver.switchTo().alert();
		String text3 = a4.getText();
		System.out.println(text3);
		a4.accept();
		WebElement ele4 = driver.findElement(By.id("btn"));
		ele4.click();
		
		String text4 = ele4.getText();
		System.out.println(text4);
		Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
	}

}