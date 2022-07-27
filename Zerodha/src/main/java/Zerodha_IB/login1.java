package Zerodha_IB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {

@FindBy(xpath = "//input[@type='text']") private WebElement Username;

@FindBy(xpath = "//input[@type='password']") private WebElement Password;
	
@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;

public login1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void UserID(){
	Username.sendKeys("OKP335");	
}
public void PWD() {	
	Password.sendKeys("WSX12345");
}
public void Clickbutton() {
	LoginButton.click();
}
}
