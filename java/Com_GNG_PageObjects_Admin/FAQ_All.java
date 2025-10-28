package Com_GNG_PageObjects_Admin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQ_All {

	public WebDriver driver;
	
	public FAQ_All(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	@FindBy (xpath="(//a[@class='nav-link nav-toggle'])[4]") WebElement FAQ;
	@FindBy (xpath="(//a[@class='nav-link'])[4]")WebElement All;
	
	@FindBy (xpath="//th[@aria-sort='ascending']") WebElement sort;
	@FindBy (xpath="//table[contains(@class,'table table-striped')]") List<WebElement> table;
	//th[@class='column-key-id sorting_asc']
	
	//Edit
	@FindBy (xpath="(//i[@class='fa fa-edit'])[8]") WebElement editbtn;
	@FindBy (xpath="//i[@class='fas fa-external-link-alt']") WebElement Englishbtn;
	@FindBy (xpath="(//div[@role='presentation'])[2]") WebElement descr;
	@FindBy (xpath="(//button[@name='submit'])[1]") WebElement SaveButton;
	
	//search
	@FindBy (xpath="//input[@type='search']") WebElement search;
	
	//pagination
	@FindBy (xpath="//ul[@class='pagination']") List<WebElement> pages;
	
	//delete
	@FindBy (xpath="(//a[contains(@class,'btn btn-icon btn-sm btn-danger')])[1]")WebElement delete;
	@FindBy (xpath="(//input[@placeholder='Value'])[3]") WebElement date;
	@FindBy (xpath="(//button[text()='Delete'])[1]") WebElement deletebtn;
	
	public void editing() {
		FAQ.click();
		All.click();
		editbtn.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//Englishbtn.click();
		//descr.clear();
		//descr.sendKeys("validation");
	}
	
	public void search() throws InterruptedException {
		search.sendKeys("How");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
	}
	
	
	public void deletingFAQ() {
		//FAQ.click();
		//All.click();
		delete.click();
		//date.sendKeys("10/28/2025");
		deletebtn.click();
	}
	
	
	public void sorting() {
		FAQ.click();
		All.click();
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click();",sort);
		sort.click();
	}
	
	public boolean isSortedAscending() {
        for (int i = 0; i < table.size() - 1; i++) {
            String current = table.get(i).getText().trim();
            String next = table.get(i + 1).getText().trim();

            if (current.compareTo(next) > 0) {
                return false;
            }
        }
        return true;	
	}

}
