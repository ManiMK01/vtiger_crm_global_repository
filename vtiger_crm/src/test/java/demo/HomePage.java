package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	
	@FindBy(id = "User_name")
	private WebElement namelink;
	
	@FindBy(name = "password")
	private WebElement passwordlink;
	
	@FindBy(partialLinkText = "log in")
	private WebElement loginBtn;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getNamelink() {
		return namelink;
	}
	
	public WebElement getPasswordLink() {
		return passwordlink;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void login(String name , String password) {
		namelink.sendKeys(name);
		passwordlink.sendKeys(password);
		loginBtn.click();
	}
	
}
