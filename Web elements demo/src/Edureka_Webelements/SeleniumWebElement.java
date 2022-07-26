package Edureka_Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "/Users/ruwanthika/Documents/Selenium/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
    Thread.sleep(5000);
    driver.findElement(By.id("nav-search-submit-button")).click();
    driver.findElement(By.linkText("T-Mobile")).click();
    driver.navigate().to("https://www.edureka.co/"); 
    Thread.sleep(4000);
    driver.navigate().back();
    driver.quit();
    
    
    
    

	}

}
