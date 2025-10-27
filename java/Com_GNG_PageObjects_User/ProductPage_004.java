package Com_GNG_PageObjects_User;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage_004 {
	JavascriptExecutor jse;
	public WebDriver driver;

	public ProductPage_004(WebDriver dr) {
		this.driver = dr;

		PageFactory.initElements(dr, this);

	}
	
	@FindBy(xpath = "//a[@class='qty-up']")
	WebElement qtyUpBtn;
	
	@FindBy(xpath = "//a[@class='qty-down']")
	WebElement qtyDownBtn;

	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addcartbtn;
	
	
	
	@FindBy(xpath = "//button[text()='Buy Now']")
	WebElement buybtn;
	
	public void increaseQuantity() throws InterruptedException {
		Thread.sleep(2000);
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 600);" );
		jse.executeScript("arguments[0].click();", qtyUpBtn);
		
	}

	public void decreaseQuantity() throws InterruptedException {
		 jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", qtyDownBtn);
		Thread.sleep(2000);
	}

	public void addtocart() {
		addcartbtn.click();
		
	}
	public void BuyNow() {
		buybtn.click();
	}

}
