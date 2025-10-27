package Com_GNG_TestCases_User;



import org.testng.annotations.Test;

import Com_GNG_PageObjects_User.HomePage_002;


public class Tc_002_HomePage extends Tc_001_LoginPage {
	
public HomePage_002 hp;
	
	@Test
	public void Home_Functionalityes() throws InterruptedException {
		hp = new HomePage_002(driver);
		hp.homelink();
		log.info("Home page open successfully");
		
		hp.emailtextbox();
		log.info("Email enter successfully");
		
//		hp.subscribeBTN();
//		log.info("Subscribe button clicked successfully");
		
		hp.FeactureCategoryList();
		log.info("All Feactugaries are print in concle successfully");
		
		
		hp.shopbutton();
		log.info("Click shop now button successfully");
		
		
	}


}
