package Com_GNG_TestCases_User;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Base_Class {
	public WebDriver driver;
	public ResourceBundle rb;
	
	public Logger log;
	
	@BeforeSuite
	@Parameters({"Browser", "URL"})
	public void OpenAppliction(String Browser, String URL) {
		
		if (Browser.equals("Chrome")) {
			ChromeOptions al=new ChromeOptions();
			al.addArguments("--disable-notifications");
			driver=new ChromeDriver(al);
			
		}else if (Browser.equals("Edge")) {driver= new EdgeDriver();}
		else if (Browser.equals("Firfox")) {driver=new FirefoxDriver();}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		rb = ResourceBundle.getBundle("Data01");
		log = Logger.getLogger("GroceNGoMart");
		PropertyConfigurator.configure("log4j.properties");
		
}
	
	@AfterSuite
	public void CloseApplication() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}



}
