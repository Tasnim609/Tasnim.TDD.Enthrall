package pageTest;

import org.testng.annotations.Test;

import baseUtill.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(invocationCount = 5, timeOut = 10000)
	public void clickLogInFromHeaderTest() {
		homePage.clickLogInFromHeader();
	}

	@Test(invocationCount = 6, threadPoolSize = 3, timeOut = 10000)

	public void navegate_to_logIn_page_and_compleate_the_pageTest() throws InterruptedException {
		homePage.navegate_to_logIn_page_and_click_enrollNowButton();
	}

	@Test

	public void navigate_to_enrollNow_page_and_fillUp_the_hole_page_test() throws InterruptedException {
		homePage.navigate_to_enrollNow_page_and_fillUp_the_hole_page();
	}

	@Test

	public void header_from_EnrollNow_page_tast() throws InterruptedException {
		homePage.header_from_EnrollNow_page();
	}

	@Test

	public void placeHolder_maxlength_of_enrollNow_page_test() throws InterruptedException {
		homePage.placeHolder_maxlength_of_enrollNow_page();
	}

	@Test

	public void getTexlogIn_page_getText_gettitle_getCurrentURL_headerTest() {
		homePage.logIn_page_getText_gettitle_getCurrentURL_header();
	}

	@Test

	public void enrollNow_link_test() {
		homePage.enrolNow_link();
	}

	@Test

	public void test_test() throws InterruptedException {
		homePage.test();
	}

	@Test

	public void isDisplay_isEnable_isSelected() throws InterruptedException {
		homePage.isDisplay_isEnable_isSelected();
	}

	@Test

	public void doubleClick() throws InterruptedException {
		homePage.doubleClick_alertClass();
	}

	@Test
	public void listTest() throws InterruptedException {
		homePage.action_and_alertClass();
	}

	@Test

	public void navegate_to_logIn_page_and_click_othersButton_clickHiddenElement() throws InterruptedException {
		homePage.navegate_to_logIn_page_and_click_othersButton_clickHiddenElement();
	}

	@Test

	public void webDriverWait_use_for_webElement_test() {
		homePage.webDriverWait_use_for_webElement();
	}

	@Test

	public void hidden_element_address02() throws InterruptedException {
		homePage.hidden_element_address02();
	}
	@Test
	
	public void dregAndDrop_action_tast() throws InterruptedException {
		homePage.dregAndDrop_action();
	}
	@Test
	
	public void slider_action_test() throws InterruptedException {
		homePage.slider_action();
	}@Test
	
	public void read_table_test () throws InterruptedException {
		homePage.read_table();
	}
	@Test
	
	public void read_any_row_of_the_table_test () throws InterruptedException {
		homePage.read_any_row_of_the_table();
	}
	@Test(enabled=false,priority=1)//enabled = enabled=true
	
	public void read_any_cell_of_a_row_of_the_table_test () throws InterruptedException {
		homePage.read_any_cell_of_a_row_of_the_table();
	}
	
	@Test
	
	public void double_click_action_test() throws InterruptedException {
		homePage.double_click_action();
	}
	@Test(enabled = false, priority = 3, groups = {"functionalTest", "sanityTest", "smokeTest", "regressionTest"})
	public void get_methods_of_the_page_03_test() {
		homePage.get_methods_of_the_page_03();
	}
	 
	@Test(enabled = false, priority = 1, groups = {"regressionTest"})
	public void get_methods_of_the_page_04_test() {
		homePage.get_methods_of_the_page_04();;
	}
	
	@Test(enabled = false, priority = 2, groups = {"functionalTest", "sanityTest"})
	public void get_methods_of_the_page_05_test() {
		homePage.get_methods_of_the_page_05();
	}
	
	@Test
	public void use_of_expectedExceptions_01_test () {
		homePage.use_of_expectedExceptions01();
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void use_of_expectedExceptions_02_test () {
		homePage.use_of_expectedExceptions02();
	}
	// It will fail as element is not found
		@Test
		public void use_of_expectedExceptions_03_test () throws InterruptedException {
			homePage.use_of_expectedExceptions03();
		}
		
		@Test(expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
		public void use_of_expectedExceptions_04_Test () throws InterruptedException {
			homePage.use_of_expectedExceptions03();
		}
		@Test
		public void new_user_registration_button_enabled__test() throws InterruptedException{
			homePage.new_user_registration_button_enabled();
		}
		
		// Important interview question
		// use of dependsOnMethods
		// change the new_user_registration_button_enabled method to fail 
		// and see the above method skipped as it depends on new_user_registration_button_enabled
		
		
		@Test(dependsOnMethods = "new_user_registration_button_enabled_test")
		public void new_user_registration_button_click_test() throws InterruptedException {
			homePage.new_user_registration_button_click();
		}
		
	
}
