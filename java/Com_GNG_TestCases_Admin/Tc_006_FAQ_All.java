package Com_GNG_TestCases_Admin;

import org.testng.annotations.Test;

import Com_GNG_PageObjects_Admin.FAQ_All;

public class Tc_006_FAQ_All extends Tc_005_Tags {
	

	public FAQ_All faq;
	
	@Test
	public void faqTest() throws InterruptedException {
		faq= new FAQ_All(driver);
		faq.editing();
		log.info("navigated to edit page successfully");
		faq.search();
		log.info("searched successfully");
		faq.deletingFAQ();
		log.info("deleted successfully");
		//log.info("sorted successfully");
		//Assert.assertTrue(faq.isSortedAscending(), "column is not sorted correctly");
	}

}
