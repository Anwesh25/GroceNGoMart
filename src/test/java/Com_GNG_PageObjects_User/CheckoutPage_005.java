package Com_GNG_PageObjects_User;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage_005 {
	public WebDriver driver;
	public JavascriptExecutor jse;
	public Select sc;

	public CheckoutPage_005(WebDriver dr) {
		this.driver =dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath="//input[@id='address_name']") WebElement fullname;
	@FindBy(xpath="//input[@id='address_email']") WebElement Email;
	@FindBy(xpath="//input[@id='address_phone']") WebElement phone;
	@FindBy(xpath="//select[@id='address_country']") WebElement SCountry;
	@FindBy(xpath="//input[@id='address_state']") WebElement state;
	@FindBy(xpath="//input[@id='address_city']") WebElement city;
	@FindBy(xpath="//input[@id='address_address']") WebElement Adress;
	@FindBy(xpath="(//li[@class='list-group-item'])[2]") WebElement shippingmethod;
	@FindBy(xpath="(//li[@class='list-group-item'])[3]") WebElement shippingmethod2;
	@FindBy(xpath="//label[text()='Cash on delivery (COD)']") WebElement radiobutton;
	@FindBy(xpath="//a[text()='You have a coupon code?']") WebElement clink;
	@FindBy(xpath="//input[@name='coupon_code']") WebElement CCode;
	@FindBy(xpath="//button[text()=' Apply']") WebElement Cubtn;
	@FindBy(xpath="//textarea[@id='description']") WebElement ordernots;
	@FindBy(xpath="//button[@type='submit']") WebElement Checkoutbtn;
	@FindBy(xpath= "(//*[text()='Back to cart'])[1]") WebElement bcart;
	@FindBy(xpath= "//button[text()='Proceed To Checkout ']") WebElement pcheckout;
	@FindBy(xpath= "//select[@id='address_id']") WebElement dd;
	@FindBy(xpath= "//label[text()='Bank transfer']") WebElement bankt;


	public void DetailsOfPerson() throws InterruptedException {


		Thread.sleep(2000);
		//		fullname.sendKeys("Noor Mahammad");
		//		Email.sendKeys("shaiknoormahammad44@gmail.com");
		//		phone.sendKeys("9885611658");
		//		Thread.sleep(2000);
		//		sc=new Select(SCountry);
		//		sc.selectByValue("IN");
		//		Thread.sleep(2000);

		jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 400);" );

		//	Thread.sleep(2000);
		//  state.sendKeys("Andhra Pradesh");
		//	city.sendKeys("Kadiri");
		//	Adress.sendKeys("14/244, Sydapuram");
		//shippingmethod.click();
		Thread.sleep(3000);
		radiobutton.click();
		clink.click();
		CCode.sendKeys("123#4svdhgf");


		jse.executeScript("arguments[0].click();", Cubtn);


		Thread.sleep(2000);

		ordernots.sendKeys("deleviry on time");
		bcart.click();

		Thread.sleep(3000);

	}	

	public void ContinueChekout() {

		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 400);" );

		jse.executeScript("arguments[0].click();", pcheckout);

	}
	public void CheckoutPage() throws InterruptedException {


		jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 300);" );
		Thread.sleep(3000);
		sc=new Select(dd);
		sc.selectByContainsVisibleText("Add new address...");

		Thread.sleep(3000);


		fullname.sendKeys("Ajay Kumar");
		Email.sendKeys("ajaykumar@gmail.com");
		phone.sendKeys("9885242424");
		Thread.sleep(2000);
		sc=new Select(SCountry);
		sc.selectByValue("IN");

		Thread.sleep(2000);
		state.sendKeys("Andhra Pradesh");
		city.sendKeys("Vijaywada");
		Adress.sendKeys("14/244, timmapur");
		shippingmethod2.click();
		
		Thread.sleep(3000);

		clink.click();
		CCode.sendKeys("RFDYR4CU35Q8");


		jse.executeScript("arguments[0].click();", Cubtn); 
		Thread.sleep(2000);
		
		bankt.click();


		ordernots.sendKeys("deleviry on time");
		Thread.sleep(2000);
		
		Checkoutbtn.click();

	}



}
