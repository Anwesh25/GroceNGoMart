package Com_GNG_TestCases_Admin;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	
	public static WebDriver driver;
	public ResourceBundle rBundle;
	public Logger log;
		
		@BeforeSuite
		public void launch() {
			
			driver=new ChromeDriver();
			driver.get("https://qa-grocengomart.w3testing.com/admin/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			rBundle=ResourceBundle.getBundle("Data01");
			log=Logger.getLogger("GroceNGoMart");
			PropertyConfigurator.configure("log4j.properties");
			
			
		}
		
		@AfterSuite
		public void close() {
			
			driver.close();
		}


}
