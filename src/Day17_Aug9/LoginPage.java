package Day17_Aug9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement	errorMsg;

	public LoginPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}

	public void clickOnLogin() {
		loginBtn.click();
	}
	
	public void validateErrorMsg(WebDriver driver)
	{
		
		System.out.println(errorMsg.isDisplayed());
	}
}
