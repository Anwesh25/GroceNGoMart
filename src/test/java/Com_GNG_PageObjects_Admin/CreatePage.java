package Com_GNG_PageObjects_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {
	
public WebDriver driver;
	
	public CreatePage(WebDriver dr) {
		
		this.driver=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	@FindBy (xpath = "//i[@class='fa fa-book']") WebElement pagesElement;
	@FindBy (xpath = "//i[@class='fa fa-plus']") WebElement create;
	
	@FindBy (xpath = "(//input[@class='form-control'])[1]") WebElement name;
	@FindBy (xpath = "(//textarea[@class='form-control'])[1]") WebElement descrip;
	@FindBy (xpath = "//span[@class='onoffswitch-switch']") WebElement toggle;
	@FindBy (xpath = "//p[@class='ck-placeholder']") WebElement desc;
	@FindBy (xpath = "(//button[@type='submit'])[2]") WebElement submit;
	@FindBy (xpath = "(//button[@type='submit'])[3]") WebElement savedit;
	
	public void create() throws InterruptedException {
		//pagesElement.click();
		//create.click();
		name.sendKeys("Ajay");
		Thread.sleep(2000);
		descrip.sendKeys("validation");
		Thread.sleep(2000);
		toggle.click();;
		desc.sendKeys("validation");
		submit.click();
		Thread.sleep(2000);
		
		
	}

}
