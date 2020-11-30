package Day1_2_3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTesting {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    
	driver.get("http://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println(title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
    ele1.sendKeys("pinky");
    WebElement ele2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
    ele2.sendKeys("R");
   
    WebElement ele3 = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@ng-model='Adress']"));
    ele3.sendKeys("123,trichy,612304");
    WebElement ele5 = driver.findElement(By.xpath("//div[@id='eid']/input[@ng-model='EmailAdress']"));
    ele5.sendKeys("user@123");
    WebElement ele6 = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[4]/input[@ng-model='Phone']"));
	ele6.sendKeys("1234567895");
	
	//WebElement ele9 = driver.findElement(By.xpath("//input[@value='Male']"));
	//ele9.click();
	WebElement ele10 = driver.findElement(By.xpath("//label[text()=' FeMale']"));
	ele10.click();
	

	WebElement ele11 = driver.findElement(By.id("checkbox1"));
	ele11.click();
	WebElement ele12 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	ele12.click();
	WebElement ele13 = driver.findElement(By.id("checkbox3"));
	ele13.click();
	
    
	WebElement ele7 = driver.findElement(By.id("msdd"));
	Actions a=new Actions(driver);
	a.click(ele7).perform();
	List<WebElement> li=driver.findElements(By.xpath("//div[@style='display: block;']//li"));
	int size = li.size();
	System.out.println(size);
	
	for(int i=0;i<li.size();i++)
		if(i==3|| i==7|| i==32)
	{
		WebElement ele = li.get(i);
		String text = ele.getText();
		System.out.println(text);
	    a.click(ele).perform();
	}
//	WebElement sel1 = driver.findElement(By.xpath("//div[@style='display: block;']//li[1]/a[text()='Arabic']"));
//	a.click(sel1).perform();
//	WebElement sel2 = driver.findElement(By.xpath("//div[@style='display: block;']//li[5]/a[text()='Czech']"));
//	a.click(sel2).perform();
//	WebElement sel3 = driver.findElement(By.xpath("//div[@style='display: block;']//li[7]/a[text()='Dutch']"));
//	a.click(sel3).perform();
	
	
	WebElement ele71 = driver.findElement(By.xpath("//label[text()='Skills']"));
	a.click(ele71).perform();
	//WebElement sel22 = driver.findElement(By.xpath("//div[text()='Czech']/span[@class='ui-icon ui-icon-close']"));
	//a.click(sel22).perform();
	
    WebElement ss1 = driver.findElement(By.id("Skills"));
    //Select s1=new Select(ss1);
    //s1.selectByVisibleText("Java");
    ss1.sendKeys("Java");
    WebElement ss2 = driver.findElement(By.id("countries"));
    Select s2=new Select(ss2);
    s2.selectByIndex(18);
    WebElement box = driver.findElement(By.xpath("//span[@role='combobox']"));
    a.click(box).perform();
   // WebElement wsel = driver.findElement(By.xpath("//input[type='search']"));
    
    Robot r=new Robot();
   // r.keyPress(KeyEvent.VK_TAB);
	//r.keyRelease(KeyEvent.VK_TAB);
	for(int i=0;i<3;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}	
		
    r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement year = driver.findElement(By.id("yearbox"));
	Select sy=new Select(year);
	sy.selectByIndex(64);
	WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select sm=new Select(month);
	sm.selectByValue("January");
	WebElement day= driver.findElement(By.id("daybox"));
	Select sd=new Select(day);
	sd.selectByValue("28");
	
	WebElement ele4 = driver.findElement(By.xpath("//input[@id='firstpassword' and @ng-model='Password']"));
    ele4.sendKeys("1234#&");
    WebElement ele8 = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[12]/input[@id='secondpassword']"));
	ele8.sendKeys("1234#&");
	
	driver.findElement(By.id("submitbtn")).click();
	
	
	}
}
