package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Zerodha_IB.login1;
import Zerodha_IB.login2;
import Zerodha_IB.login3;
import Zerodha_IB.login4;

public class Testing_Class {
	WebDriver driver;

@BeforeClass
public void Setup(){
	System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");

	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");

	driver = new ChromeDriver(opt);
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@BeforeMethod
public void login() {
	login1 log1 = new login1(driver);
	log1.UserID();
	log1.PWD();
	log1.Clickbutton();
	
	login2 log2 = new login2(driver);
	log2.pin();
	log2.Submit();	
}
@Test(priority=1)
public void Validate_Orders() {
	
login3 log3 = new login3(driver);	
log3.Orders();
String exp_url = "https://kite.zerodha.com/orders";
String exp_title = "Orders / Kite";
if (exp_url.equals(driver.getCurrentUrl())&& exp_title.equals(driver.getTitle())) {
	System.out.println("Test Case Pass");
}
else {
	System.out.println("Test Case Fail");
}
}
@Test(priority=2)
public void Validate_Holdings() {
login3 log3 = new login3(driver);
log3.Holdings();
String exp_url="https://kite.zerodha.com/holdings";
String exp_title="Holdings / Kite";
if (exp_url.equals(driver.getCurrentUrl())&& exp_title.equals(driver.getTitle())) {
	System.out.println("Test Case Pass");
}
else {
	System.out.println("Test Case Fail");
}
}
@Test(priority=3)
public void Validate_Positions() {
	login3 log3 = new login3(driver);
	log3.Positions();
	String exp_url="https://kite.zerodha.com/positions";
	String exp_title="Positions / Kite";
	if (exp_url.equals(driver.getCurrentUrl())&& exp_title.equals(driver.getTitle())) {
		System.out.println("Test Case Pass");
	}
	else {
		System.out.println("Test Case Fail");
	}
	}

@AfterMethod
public void Logout() throws InterruptedException {
	login4 log4 = new login4(driver);
	Thread.sleep(3000);
	log4.ProfileName();
	log4.Logout();
	driver.findElement(By.xpath("//a[text()='Change user']")).click();

}
@AfterClass
public void Quit() {
driver.close();
	
}
}