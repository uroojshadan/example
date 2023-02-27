package class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

//		 System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
//		 WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/comet/Selenium/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		System.out.println("Current window size : "+driver.manage().window().getSize());
		driver.manage().window().setSize(new Dimension(1400, 900));
		//Set the size of the current window. 
		//This will change the outer window dimension, not just the view port
		
		
//		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		// Thread.sleep(2000);//-->uncomment if using firefox
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		// Thread.sleep(2000);
		//driver.close();// comment this line if using firefox
		driver.quit();
		
		//sendkeys using Actions class
//		Actions action=new Actions(driver);
//		WebElement SEARCH_BAR_ELEMENT=driver.findElement(By.xpath("//input[@class='gLFyf']"));
//		//action.keyDown(Keys.SHIFT).sendKeys(SEARCH_BAR_ELEMENT,"hello").build().perform();	
//		action.sendKeys(SEARCH_BAR_ELEMENT, "hello").build().perform();
//		//action.sendKeys(Keys.chord(Keys.ARROW_DOWN)).build().perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(2000);
		
		//https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/
		

	}

}
