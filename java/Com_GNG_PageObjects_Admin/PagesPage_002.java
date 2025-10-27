package Com_GNG_PageObjects_Admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class PagesPage_002 extends CreatePage {
	
	public static WebDriver driver;
	public Robot r;
	public CreatePage c;
	public PagesPage_002(WebDriver dr) {
		super(dr);
		this.driver=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	@FindBy (xpath = "//i[@class='fa fa-book']") WebElement pagesElement;
	@FindBy (xpath = "(//button[normalize-space(@class='btn btn-secondary action-item')])[3]") WebElement create;
	
	@FindBy (xpath = "(//input[@class='form-control'])[1]") WebElement name;
	@FindBy (xpath = "(//textarea[@class='form-control'])[1]") WebElement descrip;
	@FindBy (xpath = "//span[@class='onoffswitch-switch']") WebElement toggle;
	@FindBy (xpath = "//p[@class='ck-placeholder']") WebElement desc;
	@FindBy (xpath = "(//button[@type='submit'])[2]") WebElement submit;
	@FindBy (xpath = "(//button[@type='submit'])[3]") WebElement savedit;
	@FindBy (xpath = "(//a[@role='button'])[1]") WebElement delete;
	@FindBy (xpath = "(//i[@class='fa fa-edit'])[10]") WebElement editbtn;
	@FindBy (xpath = "(//i[@class='far fa-image'])[2]") WebElement addmedia;
	@FindBy (xpath = "//button[@class='btn btn-success js-dropzone-upload dz-clickable']") WebElement upload;
	@FindBy (xpath = "//button[text()='Insert']") WebElement insert;
	
	
	
	public void edit() {
		pagesElement.click();
		create.click();
		name.sendKeys("Ajay");
		descrip.sendKeys("validation");
		toggle.click();;
		desc.sendKeys("validation");
		savedit.click();
		String s=driver.getTitle();
		System.out.println(s);
		
		
	}
	
	public void confirmEdit() {
		
		String expected="Edit page \"Ajay\" | GROCENGOMART";
		String actual=driver.getTitle();
		
		SoftAssert sft= new SoftAssert();
		if (expected.equals(actual)) {
			sft.assertTrue(true);
			System.out.println("We are in save and edit page");
		}
		else {
			sft.assertTrue(false);
			System.out.println("not in save and edit page");
		}
	}
	
	public void delete() {
		
		pagesElement.click();
		delete.click();
		
		
	}
	
	
	public void upload() throws AWTException {
		pagesElement.click();
		editbtn.click();
		addmedia.click();
		upload.click();
		StringSelection ss= new StringSelection("‪C:\\\\Users\\\\kiran\\\\OneDrive\\\\Pictures\\\\delete cate2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void create1() throws InterruptedException {
		pagesElement.click();
		create.click();
		super.create();
			
	}

}
