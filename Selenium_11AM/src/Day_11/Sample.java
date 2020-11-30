package Day_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rdata = table.findElements(By.tagName("tr"));
		//to print the all tr
//		for (int i = 0; i<rdata.size(); i++) {
//			WebElement fstrow = rdata.get(i);
//			String text = fstrow.getText();
//		System.out.println(text);
//		}
		
		//to print every row in coloumn vice
//		for(int i=0;i<rdata.size();i++) 
//		{
//			WebElement fstrow = rdata.get(i);
//		    List<WebElement> sttd = fstrow.findElements(By.tagName("td"));
//		for (int j = 0; j < sttd.size(); j++) 
//		{
//			WebElement stcell = sttd.get(i);
//			String text = stcell.getText();
//			System.out.println(text);
//		}
		
		//to print every row in column vice using foreach
		for(WebElement x:rdata ) {
			List<WebElement> y = x.findElements(By.tagName("td"));
			for(WebElement z:y) {
				String text = z.getText();
				System.out.println(text);
			}
		
		}
			
		}
	}


