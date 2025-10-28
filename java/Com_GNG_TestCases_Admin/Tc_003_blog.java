package Com_GNG_TestCases_Admin;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_Admin.Blog;


public class Tc_003_blog extends Tc_002_PagesPage{
	
public Blog bg;
	
	@Test
	public void blogTest() throws InterruptedException {
		bg=new Blog(driver);
		bg.searching();
		log.info("searched successfully");
		bg.filter();
		log.info("Applied filter successfully");
		bg.reload();
		log.info("Reloaded successfully");
		//bg.deleteAction();
		
	}

}
