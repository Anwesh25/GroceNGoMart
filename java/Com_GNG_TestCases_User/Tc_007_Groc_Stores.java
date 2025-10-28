package Com_GNG_TestCases_User;


import org.testng.annotations.Test;

import Com_GNG_PageObjects_User.StoresPage_007;

public class Tc_007_Groc_Stores extends Tc_006_OrdePlaced {
	
	public StoresPage_007 st;
	@Test
	public void GrocStores() throws InterruptedException {
		st = new StoresPage_007(driver);
		st.grocstores();
		st.GlobalOffice();
		
	}

}
