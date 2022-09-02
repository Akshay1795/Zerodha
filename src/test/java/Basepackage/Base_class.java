package Basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	public WebDriver driver;
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\javaprogram velocity\\velocity may 7\\Selenium_program\\src\\Ak\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	}

