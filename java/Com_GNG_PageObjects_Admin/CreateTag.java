package Com_GNG_PageObjects_Admin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTag {

	
public WebDriver driver;
	
	public CreateTag(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	
	@FindBy (xpath = "(//input[@class='form-control'])[1]") WebElement name;
	@FindBy (xpath = "(//textarea[@class='form-control'])[1]") WebElement descrip;
	@FindBy (xpath = "//span[@class='onoffswitch-switch']") WebElement toggle;
	@FindBy (xpath = "//p[@class='ck-placeholder']") WebElement desc;
	@FindBy (xpath = "(//button[@type='submit'])[2]") WebElement submit;
	
	public void sendDatatocretepage() {
		name.sendKeys("milk");
		descrip.sendKeys("validate milk");
		//toggle.click();
		//desc.sendKeys("milk validate");
		submit.click();
	}

}
