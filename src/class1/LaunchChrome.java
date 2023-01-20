package class1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "/Users/comet/SeleniumWorkspace/driver/chromedriver");
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		// Thread.sleep(2000);//-->uncomment if using firefox
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		// Thread.sleep(2000);
		//driver.close();// comment this line if using firefox
		driver.quit();

	}

}
