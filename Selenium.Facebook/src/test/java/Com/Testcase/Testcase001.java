package Com.Testcase;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import Com.pageobjects.LoginPage;

public class Testcase001 extends BaseClass {
	@Test
	public void loginTest() {
		driver.get(BaseURL);
		LoginPage l1=new LoginPage(driver);
		l1.setemail(email);
		l1.setpassword(password);
		l1.click();
		
	}

}
