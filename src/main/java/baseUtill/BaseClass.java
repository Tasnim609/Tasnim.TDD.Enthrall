package baseUtill;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chropme.driver", "C:\\Users\\HP 15t-dy100\\eclipse-workspace\\com.Enthrall\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		//driver =new ChromeDriver(option);//Should not show the UI
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://enthrallit.com/accounts/login/?next=/dashboard/");
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		homePage=new HomePage(driver);
	}
	@AfterMethod
	public void tearUp() {
	//	driver.quit();
	}
	
}


