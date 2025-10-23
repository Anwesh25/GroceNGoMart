package Com_GNG_PageObjects_User;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_002 {
public static WebDriver driver;
	public JavascriptExecutor jse;
	 public HomePage_002 (WebDriver dr) {
		
		this.driver = dr;
		PageFactory.initElements(dr, this);
	}		
	
	
	@FindBy(xpath="(//a[@target='_self'])[1]")
	WebElement home;

	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement text;

//	@FindBy(xpath="(//button[@class='btn'])[1] | (//button[@class='btn'])[2]")
//	WebElement btn;  

	@FindBy(xpath = "//div[contains(@class,'card-2') and not(contains(@class,'slick-cloned'))]//h6/a")
	List<WebElement> categoryList;

	@FindBy(xpath = "(//a[@class='btn btn-xs'])[1]")
	WebElement shopnow;




	public void homelink() throws InterruptedException {
		Thread.sleep(2000);
		home.click();
		
	}

	public void emailtextbox() throws InterruptedException {
		
		
		jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 300);" );
		
		text.sendKeys("shaiknoormahammad44@gmail.com");
		Thread.sleep(2000);
	}
//	public void subscribeBTN() {
//		btn.click();
//	}
	public void FeactureCategoryList() throws InterruptedException {
		jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 600);" );
		for (WebElement category : categoryList) {
			System.out.println("Feactured Categories " + category.getText());
			Thread.sleep(4000);
		}

	}
	
	public void shopbutton() {
		shopnow.click();
	
		
		
	}



}
