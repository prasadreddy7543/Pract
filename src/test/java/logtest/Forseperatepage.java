package logtest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forseperatepage {

	WebDriver driver ;
	@Test(invocationCount = 1,threadPoolSize = 1,enabled = true,groups  = {"login"})
	public void createshot () throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	WebElement password = driver.findElement(By.name("txtPassword"));
	password.sendKeys("admin123");
	WebElement loginbutton = driver.findElement(By.className("button"));
	loginbutton.click();                                                                                                                                                                                                                                                  
	WebElement sect = driver.findElement(By.xpath("//div//fieldset[@id='panel_resizable_1_1']"));
	File src =  sect.getScreenshotAs(OutputType.FILE);
	File trg = new File("E://tst.pngg");
	FileUtils.copyFile(src, trg);
	//Assert.fail();
	}
	@Test(dependsOnMethods  = {"createshot"})
	public void submitsheet() {
		System.out.println("qwertyuiop");
	}
	@AfterMethod
	public void quitdriver () {
	driver.quit();
		
	}
}
