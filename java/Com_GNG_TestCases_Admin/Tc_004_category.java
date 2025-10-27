package Com_GNG_TestCases_Admin;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_Admin.Categories;

public class Tc_004_category extends Tc_003_blog {
	
public Categories caty;
	
	@Test
	public void categoryTest() throws InterruptedException {
		caty=new Categories(driver);
		caty.cate();
		log.info("Navigated to successfully");
		//caty.OpenLink();
		caty.create();
		log.info("Category created successfully");
		
	}
	

}
