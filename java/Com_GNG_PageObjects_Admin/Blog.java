package Com_GNG_PageObjects_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Blog {
	
	public WebDriver driver;
	public Select sc;
	
	public Blog(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	@FindBy (xpath="//i[@class='fa fa-edit']") WebElement blog;
	@FindBy (xpath="(//a[@class='nav-link'])[1]") WebElement post;
	@FindBy (xpath="//input[@type='search']") WebElement search;
	
	@FindBy (xpath="//button[text()='Filters']") WebElement filter;
	@FindBy (xpath="(//select[@class='ui-select filter-column-key'])[2]") WebElement selectfield;
	@FindBy (xpath="//select[@class='ui-select filter-column-operator']") WebElement equalfield;
	@FindBy (xpath="(//input[@placeholder='Value'])[2]") WebElement value;
	@FindBy (xpath="//button[@type='submit']") WebElement apply;
	@FindBy (xpath="//a[text()='Reset']") WebElement reset;
	
	@FindBy (xpath="//i[@class='fas fa-sync']") WebElement reload;
	
	@FindBy (xpath="(//a[@role='button'])[1]") WebElement deleteIcon;
	@FindBy (xpath="(//button[text()='Delete'])[1]") WebElement deleteBtn;
	
	public void searching() throws InterruptedException {
		blog.click();
		post.click();
		Thread.sleep(3000);
		search.sendKeys("the top");
		Thread.sleep(3000);
		//search.clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	public void filter() throws InterruptedException {
		filter.click();
		Thread.sleep(3000);
		sc=new Select(selectfield);
		sc.selectByIndex(1);
		
		sc=new Select(equalfield);
		sc.selectByIndex(1);
		
		value.sendKeys("new Fashion clothes");
		Thread.sleep(3000);
		apply.click();
		Thread.sleep(3000);
		reset.click();	
		Thread.sleep(3000);
	}
	
	public void reload() {
		reload.click();
	}
	
	public void deleteAction() {
		deleteIcon.click();
		deleteBtn.click();
	}

}
