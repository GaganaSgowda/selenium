package Com.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Com.utilities.Readconfig;

public class BaseClass {
	
	Readconfig config=new Readconfig();
	public String BaseURL=config.getApplicationURL();
	public String email=config.getUseremail();
	public String password=config.getPassword();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium.Facebook\\server1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
