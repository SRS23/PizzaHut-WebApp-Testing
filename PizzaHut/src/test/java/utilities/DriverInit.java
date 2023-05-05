package utilities;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import constants.Constantss;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {
	
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if (driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(opt);
			 
			Dimension dm = new Dimension(400,600);
		driver.manage().window().setSize(dm);
		
		driver.get(Constantss.pizzaHutUrl);
		
		//driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(56));
	
		}
		return driver;
	}
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver=null;
		}
	}
}
