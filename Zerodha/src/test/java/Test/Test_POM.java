package Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Zerodha_IB.login1;
import Zerodha_IB.login2;
import Zerodha_IB.login3;

public class Test_POM {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");

	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");

	WebDriver driver = new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	login1 log1 = new login1(driver);
	log1.UserID();
	log1.PWD();
	log1.Clickbutton();
	  
	login2 log2 = new login2(driver);
	log2.pin();
	log2.Submit();
	
	login3 log3 = new login3(driver);
	log3.Orders();
	log3.Holdings();
	log3.Positions();
	
	
	
	
	
	
}
}
