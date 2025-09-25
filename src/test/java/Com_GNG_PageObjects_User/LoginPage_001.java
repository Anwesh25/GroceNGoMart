package Com_GNG_PageObjects_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_001 {
	
	public WebDriver driver;
	public Actions actions;
	
          public LoginPage_001(WebDriver dr) {
		
		this.driver = dr;
		PageFactory.initElements(dr, this);
				
	}
	
	@FindBy(xpath="//*[text()='Account']")
	WebElement mov;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement logi;
	
	@FindBy(xpath="//input[@id='txt-email']")
	WebElement email;  

	@FindBy(xpath="//input[@id='txt-password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	
	public void Acount() { 
		
		actions = new Actions(driver);
		actions.moveToElement(mov).build().perform();
		
	}
	public void login() {
		actions.click(logi).build().perform();
	}
	
	public void UserName(String grocname) {
		email.sendKeys(grocname);
		}
	public void Password(String grocpswrd) {
		password.sendKeys(grocpswrd);
	}
	public void loginbtn() {
		loginBtn.click();
	}

}
