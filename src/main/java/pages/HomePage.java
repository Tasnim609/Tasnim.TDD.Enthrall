package pages;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	JavascriptExecutor js;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//a[text()='Login' and @class='nav-link']")
	
	
	WebElement logInFromHeader;
	
	
	@FindBy(xpath = "//input[@id='emails']")
	WebElement email;
	@FindBy(xpath = "//input[@id='password']")
	WebElement userName;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButton;
	@FindBy(xpath = "//span[contains(text(),'Automation')]")
	WebElement automation;
	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNowButton;
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fName;
	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement mName;
	@FindBy(xpath = "//input[@id='id_l_name']")
	WebElement lName;
	@FindBy(xpath = "//select[@name='i_am']")
	WebElement iAm;
	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']//option")
	List<WebElement> iAMList;
	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement coursrWishToInroll;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumber;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAdress;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//select[@name='gender']")
	WebElement gender;
	@FindBy(xpath = "//input[@name='image']")
	WebElement personal_image;
	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement photoId;
	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYear;
	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement birthMonth;
	@FindBy(xpath = "//select[@id='id_birth_month']//option")
	List<WebElement> birthMonthList;
	@FindBy(xpath = "//select[@name='birth_date']")
	WebElement birthDate;
	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement home_address_line_1;
	@FindBy(xpath = "//input[@id='id_home_address_line_2']")
	WebElement  home_address_line_2;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//select[@name='state']")
	WebElement state;
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zip_code;
	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement immigration_status;
	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrival_date;
	@FindBy(xpath = "//input[@name='emergency_contact']")
	WebElement emergency_contact;
	@FindBy(xpath = "//input[@name='know_us']")
	WebElement know_us;
	@FindBy(xpath = "//select[@name='highest_education']")
	WebElement highest_education;
	@FindBy(xpath = "//select[@name='country_of_origin']")
	WebElement country_of_origin;
	@FindBy(xpath = "//input[@id='selected_language']")
	WebElement primary_language;
	@FindBy(xpath = "//div[text()='Bengali']")
	WebElement bengali;
	
	@FindBy(xpath = "//input[@id='id_sign_by_name']")
	WebElement sign_by_name;
	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement is_agree_checkbox;
	@FindBy(xpath = "//a[contains(text(),'Terms')]")
	WebElement TermsAndConditions;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submit;
	@FindBy(xpath = "//button[contains(text(),'Right')]")
	WebElement RightClickAction;
	@FindBy(xpath = "//li[text()='Back']")
	WebElement back;
	
	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement header;
	@FindBy(xpath = "//h5[text()='Please enter your personal and contact information.']")
	WebElement subHeader;
	@FindBy(xpath = "//p[text()='All fields are required unless marked (optional).']")
	WebElement otherHeader;
	@FindBy(xpath = "//a[text()='Terms and condition']")
	WebElement terms_and_condition;
	@FindBy (xpath = "//button[@id='acceptButton']")
	WebElement acceptButton;
	@FindBy(xpath = "//button[normalize-space(text())='Others']")
	WebElement othersButton;
	@FindBy (xpath = "//button[@id='formButton2']")
	WebElement HiddenButton;
	////h5[text()='DataTable Example']
	@FindBy (xpath = "//h5[contains(text(),'DataTable Example')]")
	WebElement DataTableExample;

	public void clickLogInFromHeader() {
		logInFromHeader.click();
	}

	public void navegate_to_logIn_page_and_click_enrollNowButton() throws InterruptedException {
		Thread.sleep(3000);
		email.sendKeys("tasnimchowdhury.qa@gmail.com",Keys.TAB);
		Thread.sleep(3000);
		userName.sendKeys("Darimee2010",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		// loginButton.click();
		Thread.sleep(3000);
		automation.click();
		Thread.sleep(3000);
		enrollNowButton.click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		// Extract parent and child from window Handle
		String parent = (String) windowHandles.toArray()[0];
		String child = (String) windowHandles.toArray()[1];
		driver.switchTo().window(child);
		System.out.println(windowHandles);
		fName.sendKeys("Tasnim",Keys.TAB);
		mName.sendKeys("Qurashy",Keys.TAB);
		Thread.sleep(3000);
		lName.sendKeys("Chowdhury",Keys.ENTER);
		Thread.sleep(3000);
	}
	

	public void navigate_to_enrollNow_page_and_fillUp_the_hole_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(4000);
		fName.sendKeys("Tasnim",Keys.TAB);
		mName.sendKeys("");
		Thread.sleep(3000);
		lName.sendKeys("Chowdhury",Keys.TAB);
		Thread.sleep(3000);
		Select select = new Select(iAm);
		select.selectByVisibleText("a Student");
		Thread.sleep(3000);
		Select select01 = new Select(coursrWishToInroll);
		select01.selectByVisibleText("Python");
		Thread.sleep(3000);
		phoneNumber.sendKeys("6092332201");
		Thread.sleep(3000);
		emailAdress.sendKeys("tasnimchowdhury.qa@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("Darimee2010");
		Thread.sleep(3000);
		Select select02 = new Select(gender);
		select02.selectByVisibleText("Female");
		Thread.sleep(3000);
		File pI01 = new File("./image/personalImage.jpg");
		personal_image.sendKeys(pI01.getAbsolutePath());
		Thread.sleep(3000);
		File pI02 = new File("./image/photoId.jpg");
		photoId.sendKeys(pI02.getAbsolutePath());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		Select select03 = new Select(birthYear);
		select03.selectByValue("1960");
		Thread.sleep(3000);
		Select select04 = new Select(birthMonth);
		select04.selectByVisibleText("February");
		Thread.sleep(3000);
		Select select05 = new Select(birthDate);
		select05.selectByVisibleText("Select Birth Date");
		Thread.sleep(3000);
		city.sendKeys("pennsylvania");

		Thread.sleep(3000);

		Select select06 = new Select(state);
		select06.selectByVisibleText("Alabama");
		Thread.sleep(3000);
		zip_code.sendKeys("19024");
		Thread.sleep(3000);
		Select select07 = new Select(immigration_status);
		select07.selectByVisibleText("Citizen");
		Thread.sleep(3000);
		arrival_date.sendKeys("5/04/1999");

		Thread.sleep(3000);
		emergency_contact.sendKeys("4043333333");
		Thread.sleep(3000);
		know_us.sendKeys("friend");
		Thread.sleep(3000);
		Select select08 = new Select(highest_education);
		select08.selectByVisibleText("Associate");
		Thread.sleep(3000);
		Select select09 = new Select(country_of_origin);
		select09.selectByValue("AL");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(primary_language).build().perform();
		Thread.sleep(3000);
		bengali.click();
		Thread.sleep(3000);
		sign_by_name.sendKeys("Tasnim Chowdhury");
		Thread.sleep(3000);
		Actions dC = new Actions(driver);
		dC.doubleClick(TermsAndConditions).build().perform();
		Thread.sleep(7000);
		acceptButton.click();
		
	
	}

	public void placeHolder_maxlength_of_enrollNow_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(3000);

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		String actualPlaceHolder = password.getAttribute("placeholder");
		String expectedPlaceHolder = "Password";
		Assert.assertEquals(actualPlaceHolder, expectedPlaceHolder, "PassWord placeHolder is not match");
		System.out.println(actualPlaceHolder);

		String actualMaxlength = password.getAttribute("maxlength");
		System.out.println(actualMaxlength);

		String actualPrimaryLanguage = primary_language.getAttribute("placeholder");
		System.out.println(actualPrimaryLanguage);

	}

	public void logIn_page_getText_gettitle_getCurrentURL_header() {
		String actual = loginButton.getText();
		System.out.println(actual);
		String expected = "Login";
		Assert.assertEquals(actual, expected, "   actual and expected is not match  ");

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://enthrallit.com/accounts/login/?next=/dashboard/";
		Assert.assertEquals(actualURL, expectedURL, "get current URL is not match");
		System.out.println(actualURL);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Enthrall IT";
		Assert.assertEquals(actualTitle, expectedTitle, "get Title is not match");
		System.out.println(actualTitle);

		String actualgetAttribute = email.getAttribute("maxlength");
		String expectedGetAttribute = "255";
		Assert.assertEquals(actualgetAttribute, expectedGetAttribute, "actual and expected is not match");
		System.out.println(actualgetAttribute);

		String window = driver.getWindowHandle();
		System.out.println(window);
	}

	public void enrolNow_link() {
		// Enroll Now (anchor tag)-link
		driver.findElement(By.linkText("Enroll Now")).click();
		driver.findElement(By.partialLinkText("Enroll")).click();
		driver.findElement(By.xpath("//a[text()='Enroll Now' and @id='enroll-now']")).click();

	}

	public void header_from_EnrollNow_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(3000);

		String actualHeader = header.getText();
		String expectedHeader = "Select your course from the dropdown";
		Assert.assertEquals(actualHeader, expectedHeader, "actual and expected is not match");
		System.out.println(actualHeader);

		String actualSubHeader = subHeader.getText();
		String expectedSubHeader = "Please enter your personal and contact information.";
		Assert.assertEquals(actualSubHeader, expectedSubHeader, "actual and expected is not match");
		System.out.println(actualSubHeader);
		

		String actualOtherHeader = otherHeader.getText();
		String expectedOtherHeader = "All fields are required unless marked (optional).";
		Assert.assertEquals(actualOtherHeader, expectedOtherHeader, "actual and expected is not match");
		System.out.println(actualOtherHeader);
	}

	public void test() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(4000);
		
		// One by one will come automatically
		// iAMList.add(TermsAndConditions);
		Select select_iam = new Select(iAm);

		for (int i = 1; i < iAMList.size(); i++) {
			select_iam.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		Select select_birthMonth = new Select(birthMonth);
		for (int i = 1; i < birthMonthList.size(); i++) {
			select_birthMonth.selectByIndex(i);
			Thread.sleep(2000);
		}
	}

	public void isDisplay_isEnable_isSelected() throws InterruptedException {
		boolean emailDisplay = email.isDisplayed();
		System.out.println("email is displayed  : " + emailDisplay);
		email.sendKeys("google");

		boolean logInButtonEnabled = loginButton.isEnabled();
		System.out.println(logInButtonEnabled);
		loginButton.click();

		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(4000);

		JavascriptExecutor js01 = (JavascriptExecutor) driver;
		js01.executeScript("arguments[0].scrollIntoView(true)", primary_language);

		boolean isAgreeCheckBoxSelected = is_agree_checkbox.isSelected();
		System.out.println(isAgreeCheckBoxSelected);
	}

	public void action_and_alertClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(4000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Actions actions = new Actions(driver);
		actions.moveToElement(RightClickAction).contextClick().build().perform();
		back.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert.getText());
		alert.accept();//OK click
		
		
	}

	public void doubleClick_alertClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(4000);
		Actions dC = new Actions(driver);
		dC.doubleClick(TermsAndConditions).build().perform();
		Thread.sleep(7000);
		acceptButton.click();//this is not right
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();//OK click
		alert.getText();
		//alert.dismiss();
	}
	//when we find Element Enterception Exception then we have do 
	//JavascriptExecutor for Click
	//"Element not Interacted Exception"  or "click intercepted Exception" for Hidden Element
	//we will get "Style=display: none/block;" in the HTML document
	public void navegate_to_logIn_page_and_click_othersButton_clickHiddenElement() throws InterruptedException {
		Thread.sleep(3000);
		
		email.sendKeys("tasnimchowdhury.qa@gmail.com",Keys.TAB);
		Thread.sleep(3000);
		userName.sendKeys("Darimee2010",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		// loginButton.click();
		Thread.sleep(3000);
		automation.click();
		Thread.sleep(3000);
othersButton.click();
Thread.sleep(5000);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", HiddenButton);
HiddenButton.click();//not working
JavascriptExecutor js01 =(JavascriptExecutor) driver;
//Actions action = new Actions(driver);
//action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
}
	public void webDriverWait_use_for_webElement() {
		//"Element not visible Exception" When an element is not found (Explicitly wait)
		//"No such Element Exception" for all WebElement (implicitly wait)
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(3000));
		//By forgerPassword =By.xpath("//a[text()='Forgot Password?']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot Password?']"))).click();
		//wait .until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
		
		
	//	boolean displayed = wait.until(ExpectedConditions.visibilityOf(loginButton)).isDisplayed();
		//System.out.println(displayed);
	}
	public void hidden_element_address02() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		Thread.sleep(4000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		home_address_line_1.sendKeys("ABC",Keys.TAB);
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='abc'", home_address_line_2);
	}
	
}
