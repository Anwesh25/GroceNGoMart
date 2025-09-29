package Com_GNG_PageObjects_User;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage_003 {
	public  WebDriver driver;
    JavascriptExecutor jse;
    
	
	 public ShopPage_003(WebDriver dr) {
		
		this.driver =dr;
		
		PageFactory.initElements(dr, this);
		
		
	}
	
	@FindBy(xpath = "(//div[@class='sort-by-product-wrap'])[1]")
	WebElement ddElement;
	
	@FindBy(xpath = "(//div[@class='sort-by-dropdown products_ajaxsortby show'])[1]//ul//li[2]")
	WebElement movElement;
	
	
	@FindBy(xpath = "(//div[@class='sort-by-product-wrap'])[2]")
	WebElement sortbyElement;
	
	@FindBy(xpath = "(//div[@class='sort-by-dropdown products_ajaxsortby show'])[2]//ul//li[3]")
	WebElement selectElement;
	
	@FindBy(xpath = "//*[text()='Filters']")
	WebElement filbtn;
	
	@FindBy(xpath = "//div[@id='mCSB_1']//label")
	List<WebElement> categoriCheckbox;
	
	@FindBy(xpath = "//div[@id='mCSB_2']//label")
	List<WebElement> BrandsCheckbox;
	
	
	@FindBy(xpath = "//a[contains(text(),'Clear All')]")
	WebElement clerElement;
	
	@FindBy(xpath = "(//div[@class='product-action-1'])[4]")
	WebElement product;
	
	

	public void Showdd() {
		
		ddElement.click();
	jse = (JavascriptExecutor)driver;
	
	jse.executeScript("arguments[0].click();", movElement);	
	}
	
	public void SortBy() {
		sortbyElement.click();
		jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",selectElement );
	}
	public void FilterButton() throws InterruptedException {
		filbtn.click();
		Thread.sleep(2000);
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 600);" );
		
	}
	public void ByCategories() {
		int size =BrandsCheckbox.size();
		System.out.println(size);
		for (int i=0; i<size; i++) {
			  WebElement checkbox = BrandsCheckbox.get(i);
			  jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", checkbox);
			
			
		}
		
	}
	public void ByBrands() {
		int size =categoriCheckbox.size();
		System.out.println(size);
		for (int i=0; i<size; i++) {
			 WebElement Bcheckbox = categoriCheckbox.get(i);
			  jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].click();", Bcheckbox);
			
			
		}
		
	}
	
	
	
	
	
	public void Product() {
		clerElement.click();
		
		
		
	}

}
