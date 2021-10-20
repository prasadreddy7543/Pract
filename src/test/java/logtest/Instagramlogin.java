package logtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagramlogin {
	WebDriver driver;
	@Test
	
	public void login () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys("Venkatesh862@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("Thelidhu8620");
		WebElement button = driver.findElement(By.xpath("//*[@class='            qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '][1]"));
		button.click();
		
	}

}
