package Com_GNG_PageObjects_User;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Order_Placed {
	public WebDriver driver;
	
	public Select sc;

	public Order_Placed(WebDriver dr) {
		
		this.driver =dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath="//a[text()=' Continue shopping ']") WebElement Cshipping;
	
	
	public void ContinueShipping() {
		Cshipping.click();
	}

}
