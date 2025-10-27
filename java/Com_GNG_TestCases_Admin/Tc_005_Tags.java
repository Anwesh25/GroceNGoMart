package Com_GNG_TestCases_Admin;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_Admin.Tags;

public class Tc_005_Tags extends Tc_004_category {

public Tags tg;
	
	@Test
	public void tagsTest() {
		tg= new Tags(driver);
		tg.openTag();
		tg.createTag();
		log.info("tag created successfully");
	}
}
