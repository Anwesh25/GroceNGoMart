package Com_GNG_PageObjects_Admin;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Categories {
	
	public WebDriver driver;
	public Select sc;
	public Actions act;
	
	public Categories(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(dr, this);
		
	}
	
@FindBy (xpath="//i[@class='fa fa-edit']") WebElement blog;
	
	@FindBy (xpath="(//a[@class='nav-link'])[2]")WebElement Category;
	
	@FindBy (xpath="//button[@class='btn btn-primary toggle-tree']")WebElement Collapse;
	
	@FindBy (xpath="(//i[@class='far fa-file'])[1]") WebElement link;
	@FindBy (xpath="(//button[@type='submit'])[1]") WebElement save;
	
	@FindBy (xpath="//i[@class='fa fa-plus']") WebElement createbtn;
	@FindBy (xpath ="//input[@name='name']")WebElement name;
	@FindBy (xpath="//span[text()='None']") WebElement parent;
	@FindBy (xpath="(//textarea[@class='form-control'])[1]") WebElement description;
	@FindBy (xpath= "(//li[@role='option'])[3]") WebElement dropdown;
	@FindBy (xpath="(//span[@class='onoffswitch-switch'])[1]") WebElement toggle;
	@FindBy (xpath="(//span[@class='onoffswitch-switch'])[2]") WebElement toggle2;
	@FindBy (xpath="//input[@name='order']") WebElement Order;
	@FindBy (xpath="(//button[@name='submit'])[1]") WebElement save2;

	
	public void cate() {
		blog.click();
		Category.click();
		//Collapse.click();
	}
	
	public void OpenLink() throws InterruptedException {
		act=new Actions(driver);
		driver.navigate().refresh();
		link.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		act.moveToElement(save).build().perform();
		save.click();
		Thread.sleep(300);
		jse.executeAsyncScript("window.scrollTo(0, 0;");
	}
	
	public void create() throws InterruptedException {
		Thread.sleep(3000);
		createbtn.click();
		Thread.sleep(2000);
		name.sendKeys("clothes");
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", parent);
		//parent.click();
		//sc.selectByIndex(3);
		description.sendKeys("validation");
		Thread.sleep(2000);
		//toggle.click();
		//toggle2.click();
		Order.clear();
		Thread.sleep(2000);
		Order.sendKeys("2");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",save2);
		//save2.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(300);
		
	    
	}

}
