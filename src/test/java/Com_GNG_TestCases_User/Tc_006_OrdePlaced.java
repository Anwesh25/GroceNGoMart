package Com_GNG_TestCases_User;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_User.Order_Placed;

public class Tc_006_OrdePlaced extends Tc_005_CheckoutPage {
	public Order_Placed or;
	
	@Test
	public void CShipping() {
		or = new Order_Placed(driver);
		or.ContinueShipping();
		log.info("Countinue shipping successfully");
		
	}
	
	

}
