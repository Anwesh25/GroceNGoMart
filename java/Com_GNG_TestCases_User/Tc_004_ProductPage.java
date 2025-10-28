package Com_GNG_TestCases_User;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_User.ProductPage_004;

public class Tc_004_ProductPage extends Tc_003_ShopPage {
	
	public ProductPage_004 PP;
	@Test
	public void Productpage() throws InterruptedException {
		PP = new ProductPage_004(driver);
		PP.increaseQuantity();
		log.info("Click up successfully");
		
		PP.decreaseQuantity();
		log.info("Click down successfully");
		PP.addtocart();
		log.info("Click Add to cart buttons successfully");
		
		PP.BuyNow();
		log.info("Click BuyNow button successfully");
		
	}

}
