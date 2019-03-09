package TestsPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Parent.ParentClass;

public class LoginPageTest extends ParentClass {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void url() {
		first();
		loginpage = new LoginPage();
		
}
	@Test
	public void login() {
		
		homepage = loginpage.details(pro.getProperty("username"), pro.getProperty("password"));
		
	}
	/*@AfterMethod
	public void tearDown(){
		
		dri.quit(); */
		
	} 
	
	


