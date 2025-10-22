package Com_GNG_TestCases_Admin;

import org.testng.annotations.Test;

public class Tc_004_category extends Tc_003_blog {
	
public Categories caty;
	
	@Test
	public void categoryTest() throws InterruptedException {
		caty=new Categories(driver);
		caty.cate();
		//caty.OpenLink();
		caty.create();
		
	}
	

}
