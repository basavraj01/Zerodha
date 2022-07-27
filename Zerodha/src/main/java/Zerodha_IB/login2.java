package Zerodha_IB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {

	
@FindBy(xpath = "//input[@id='pin']") private WebElement PIN;	
	
@FindBy(xpath = "//button[@type='submit']")	private WebElement Continue;
	

public login2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void pin() {
	PIN.sendKeys("7654321");
}
public void Submit() {
	Continue.click();
}



	
}
