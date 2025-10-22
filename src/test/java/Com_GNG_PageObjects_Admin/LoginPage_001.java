package Com_GNG_PageObjects_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_001 {

	public static WebDriver driver;

	public LoginPage_001(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);

	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement unmElement;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement pwdElement;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement subElement;

	public void login(String uname, String pwd) throws InterruptedException {
		unmElement.sendKeys(uname);
		pwdElement.sendKeys(pwd);
		subElement.click();
		Thread.sleep(3000);
	}

}
