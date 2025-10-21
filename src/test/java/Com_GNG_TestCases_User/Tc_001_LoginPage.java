package Com_GNG_TestCases_User;
import org.testng.annotations.Test;


import Com_BaseClass.Base_Class;
import Com_GNG_PageObjects_User.*;



public class Tc_001_LoginPage extends Base_Class{
	public LoginPage_001 gl;
	@Test
	public void Groc_UserLogin() throws InterruptedException {
		gl = new LoginPage_001(driver);
		gl.Acount();
		log.info("Click Account successfully");

		gl.login();
		log.info("Click on login successfully");

		gl.UserName(rb.getString("grocname"));
		log.info("username entered Successfully");

		gl.Password(rb.getString("grocpswrd"));
		log.info("Password entered Successfully");

		Thread.sleep(3000);
		gl.loginbtn();
		log.info("Login successfully");
	}



}

