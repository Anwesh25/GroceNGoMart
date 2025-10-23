package Com_BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;



import org.testng.annotations.*;

import org.testng.annotations.Parameters;

public class Base_Class {
	public static WebDriver driver;
	public ResourceBundle rb;

	public Logger log;


	@BeforeClass
	@Parameters({"Browser", "URL"})
	public void OpenAppliction(String Browser, String url) {

		if (Browser.equals("Chrome")) {
			ChromeOptions al=new ChromeOptions();
			al.addArguments("--disable-notifications");
			driver=new ChromeDriver(al);

		}else if (Browser.equals("Edge")) {
			driver= new EdgeDriver();}
		else if (Browser.equals("Firfox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		rb = ResourceBundle.getBundle("Data01");
		log = Logger.getLogger("GroceNGoMart");
		PropertyConfigurator.configure("log4j.properties");

	}
	public void CaptureScreenshot(String status) throws IOException {

		TakesScreenshot takesc = (TakesScreenshot) driver;
		
		File src = takesc.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		String timestamp = dateFormat.format(new Date());
		String path = "./Screenshots/"+ status + "_" + timestamp + ".png";
		File tar = new File(path);
		FileHandler.copy(src, tar);
	}


	@AfterClass
	public void CloseApplication() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}


}
