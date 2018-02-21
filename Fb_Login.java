package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/kashishgupta/eclipse-workspace/hello/lib/chromedriver/chromedriver");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://facebook.com");
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
driver.findElement(By.cssSelector("#email")).sendKeys("YourEmail/Mobile");
driver.findElement(By.cssSelector("#pass")).sendKeys("PasswordOfFacebook");
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

driver.findElement(By.id("loginbutton")).click();


	}}
