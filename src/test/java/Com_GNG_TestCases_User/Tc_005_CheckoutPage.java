package Com_GNG_TestCases_User;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_User.CheckoutPage_005;

public class Tc_005_CheckoutPage extends Tc_004_ProductPage {
	public CheckoutPage_005 ckp;
	@Test
	public void CheckoutProduct() throws InterruptedException {
		ckp = new CheckoutPage_005(driver);
		ckp.DetailsOfPerson();
		log.info("all data inered and click checkout button successfully");
		
		ckp.ContinueChekout();
		log.info("Successufully move for Cart page");
		ckp.CheckoutPage();
		log.info("all New data inered and click checkout button successfully");
		
	}

}
