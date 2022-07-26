package Edureka_Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gecoDriver_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ruwanthika/Documents/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-GB&.intl=gb&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		Thread.sleep(4000);
		//WebElement username = driver.findElement(By.id("identifierId"));
		//username.sendKeys("guniyangodagedil@gmail.com");
		//driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("guniyangodagedil@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		
		

	}

}
