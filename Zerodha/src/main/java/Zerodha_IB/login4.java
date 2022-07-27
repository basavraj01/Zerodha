package Zerodha_IB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login4 {

@FindBy(xpath = "//span[text()='OKP335']") private WebElement ProfileName;

@FindBy(xpath = "//a[text()=' Logout']") private WebElement Logout;

public login4(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void ProfileName() {
	ProfileName.click();
}
public void Logout() {
	Logout.click();
}
}
