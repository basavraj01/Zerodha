package Zerodha_IB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class login3 {

@FindBy (xpath="//span[text()='Orders']") private WebElement Orders;
	
@FindBy (xpath="//span[text()='Holdings']") private WebElement Holdings;

@FindBy (xpath="//span[text()='Positions']") private WebElement Positions;

@FindBy (xpath="//span[text()='Funds']") private WebElement Funds;

public login3(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void Orders() {
	Orders.click();
}

public void Holdings() {
	Holdings.click();
}
public void Positions() {
	Positions.click();
}
public void Funds() {
	Funds.click();
}

}

