package Com_GNG_TestCases_User;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_User.ShopPage_003;


public class Tc_003_ShopPage extends Tc_002_HomePage{
	public ShopPage_003 SP;
	@Test
public void shopPage() throws InterruptedException {
		
		SP = new ShopPage_003(driver);
		SP.Showdd();
		log.info("Click shows 24 successfully");
		
		SP.SortBy();
		log.info("Click sort by  button successfully");
		
		SP.FilterButton();
		log.info("Click Filter button successfully");
		SP.ByCategories();
		log.info("Click select Categorie checkboxes successfully");
		
		SP.ByBrands();
		log.info("Click select Brands checkboxes successfully");
		log.info("Clear selected successfully");
		
		SP.Product();
		log.info("click product successfully");
		
		
	}


}
