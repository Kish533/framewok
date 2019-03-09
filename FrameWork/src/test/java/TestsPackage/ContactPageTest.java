package TestsPackage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ContactsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Parent.ParentClass;
import util.TestUtil;

public class ContactPageTest extends ParentClass{
	 LoginPage loginpage;
	 HomePage homepage;
	 TestUtil testutil;
	 ContactsPage contactpage;
	 
	 
	 
	public  ContactPageTest() {
	super();
		// TODO Auto-generated constructor stub
	}
	 
		@BeforeMethod
		public void login() {
			first();
			testutil = new TestUtil();
			loginpage = new LoginPage();
			contactpage = new ContactsPage();
			homepage = loginpage.details(pro.getProperty("username"),pro.getProperty("password"));
			dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait, TimeUnit.SECONDS);
		}
		
@Test(priority=1)
		
		public void ConpageTest() {
			
			testutil.switchtoframe();
         homepage.ContPage();
         
         contactpage.checkclick("Rayudu satyanarayana");
         
		}
	
		
	
}
