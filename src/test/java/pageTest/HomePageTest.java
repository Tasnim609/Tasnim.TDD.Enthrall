package pageTest;

import org.testng.annotations.Test;

import baseUtill.BaseClass;

public class HomePageTest extends BaseClass {
	@Test
	public void clickLogInFromHeaderTest() {
		homePage.clickLogInFromHeader();
	}

	@Test
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
}
