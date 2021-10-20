package logtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captureScreenshot {
WebDriver driver;
@Test
public void createscreem () throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
TakesScreenshot ts  = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File trg = new File("E:\\test.png");
FileUtils.copyFile(src, trg);
//prasad
	
}}
