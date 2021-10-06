package logtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logggg {
WebDriver driver ;
@Test
public void lot () {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Dimension dimen = new Dimension(1080, 2340);
	Point p = new Point(411, 823);
	
	driver.manage().window().setPosition(p);
	//driver.manage().w
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	WebElement password = driver.findElement(By.name("txtPassword"));
	password.sendKeys("admin123");
	WebElement loginbutton = driver.findElement(By.className("button"));
	loginbutton.click();
	WebElement leavebutton = driver.findElement(By.xpath("//*[@id  = 'menu_leave_viewLeaveModule']"));
	leavebutton.click();
	WebElement al = driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_1']"));
	al.click();
	WebElement employee = driver.findElement(By.name("leaveList[txtEmployee][empName]"));
	employee.sendKeys("sai");
	Select dropdown = new Select(driver.findElement(By.id("leaveList_cmbSubunit")));
	dropdown.selectByVisibleText("Engineering");
	WebElement ss = driver.findElement(By.xpath("//*[@id='leaveList_cmbWithTerminated']"));
	ss.click();
	driver.findElement(By.xpath("//*[@class='plainbtn']")).click();
	
}
}
