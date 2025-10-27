package Com_GNG_TestCases_Admin;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_Admin.CreatePage;
import Com_GNG_PageObjects_Admin.PagesPage_002;

public class Tc_002_PagesPage extends Tc_001_LoginPage {
	
	public PagesPage_002 pg;
	public CreatePage create;
	
	@Test
	public void createTest() throws InterruptedException, AWTException {
		pg= new PagesPage_002(driver);
		pg.create1();
		log.info("page created successfully");
		
	}



}
