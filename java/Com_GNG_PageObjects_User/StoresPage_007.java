package Com_GNG_PageObjects_User;

import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoresPage_007 {

	public WebDriver driver;
	public JavascriptExecutor jse;


	public StoresPage_007(WebDriver dr) {
		this.driver = dr;

		PageFactory.initElements(dr, this);

	}
	@FindBy (xpath = "(//a[@href='https://qa-grocengomart.w3testing.com/stores'])[1]") WebElement Cstores;
	@FindBy (xpath = "(//i[@class='fi-rs-arrow-small-right'])[13]") WebElement nextpagElement;
	@FindBy (xpath = "(//a[text()='Visit Store '])[7]") WebElement VisitStore;
	@FindBy (xpath = "//div[@class='custome-checkbox']") List<WebElement> ByCategoriesCheckbox;


	public void grocstores() throws InterruptedException {
		Cstores.click();
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 1700);" );
		Thread.sleep(2000);

		nextpagElement.click();
	}
	public void GlobalOffice() throws InterruptedException {


		Thread.sleep(4000);
		jse = (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0, 900);" );

		jse.executeScript("arguments[0].scrollIntoView();", VisitStore);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", VisitStore);
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 1500);" );
		
		int size =ByCategoriesCheckbox.size();
		System.out.println(size);
		for (int i=0; i<size; i++) {
			  WebElement checkbox = ByCategoriesCheckbox.get(i);
			  jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", checkbox);
		}







	}

}
