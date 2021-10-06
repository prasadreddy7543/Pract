package logtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ja {
	WebDriver driver ;
	@Test
	public void lggg () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Dimension dimen =  new Dimension(1080, 2340);
		driver.manage().window().maximize();
		//driver.manage().w
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('btnLogin').click()");
		 
		
	}
}