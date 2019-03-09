package TestsPackage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CalanderPage;
import Pages.CompaniesPage;
import Pages.ContactsPage;
import Pages.DealsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Parent.ParentClass;
import util.TestUtil;

public class HomePageTest extends ParentClass {
	 LoginPage loginpage;
	 HomePage homepage;
	 TestUtil testutil;
	/* ContactsPage contactpage;
	 CompaniesPage companiespage;
	 DealsPage dealpage;
	 CalanderPage calenderpage;*/
	 
	 
	 
	public HomePageTest() {
		super();
	}
	 
	 
	@BeforeMethod
	public void login() {
		first();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		
		homepage = loginpage.details(pro.getProperty("username"),pro.getProperty("password"));
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait, TimeUnit.SECONDS);
		
		
	}
		@Test(priority=1)
		
		public void ConpageTest() {
			
			testutil.switchtoframe();
         homepage.ContPage();
         
		}
		
		@Test(priority=2)
		public void CalPageTest(){
			testutil.switchtoframe();
         homepage.CalPage();
		}
		@Test(priority=3)
		public void ComPageTest() {
			testutil.switchtoframe();
         homepage.CompPage();
		}
		
		@Test()
		public void DealPageTest() {
			testutil.switchtoframe();
			homepage.DlsPage();
			
		}
		
		@AfterMethod
		public void quit() {
		dri.quit();
		}
	/*	contactpage = new ContactsPage();

		
		companiespage = new CompaniesPage();		
		dealpage =new DealsPage();
		calenderpage = new CalanderPage();
		
		*/
	}
	


