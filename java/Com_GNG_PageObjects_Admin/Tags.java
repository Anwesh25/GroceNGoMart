package Com_GNG_PageObjects_Admin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tags extends CreateTag{

public WebDriver driver;
	
	public Tags(WebDriver dr) {
		super(dr);
		this.driver=dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy (xpath="//i[@class='fa fa-edit']") WebElement blog;
	@FindBy (xpath="(//a[@class='nav-link'])[3]") WebElement tagBtn;
	//@FindBy (xpath="") WebElement ;
	
	@FindBy(xpath = "//table//tbody//tr/td[1]") // assuming first column has tag name
	List<WebElement> tagRows;
	
	// create-----------
    @FindBy (xpath = "//i[@class='fa fa-plus']") WebElement create;
	
	
	
	public void openTag() {
		//blog.click();
		tagBtn.click();
	}
	
	public void createTag() {
		create.click();
		super.sendDatatocretepage();
	}
	


}
