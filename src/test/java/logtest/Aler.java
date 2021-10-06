package logtest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aler {
WebDriver driver ;
@Test
public void handle () {
	Logger log = LogManager.getLogger(Aler.class.getName());
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	WebElement alrt = driver.findElement(By.name("cusid"));
	alrt.sendKeys("qwert");
	log.info("cusid is qwert");
	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	Alert aa = driver.switchTo().alert();
	aa.accept();
	Alert bb = driver.switchTo().alert();
	bb.accept();

	
}
}
