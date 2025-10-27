package Com_GNG_TestCases_Admin;


import org.testng.annotations.Test;


import Com_BaseClass.Base_Class;
import Com_GNG_PageObjects_Admin.LoginPage_001;


public class Tc_001_LoginPage extends Base_Class{

		
		public LoginPage_001 lPom;
		
		@Test
		public void testing() throws InterruptedException {
			lPom=new LoginPage_001(driver);
			lPom.login(rb.getString("uname"), rb.getString("pwd"));
			log.info("login sucessfull");
		}
	
	
}
