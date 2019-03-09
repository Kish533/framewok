package TestsPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.CreateNewContactClass;
import Pages.HomePage;
import Pages.LoginPage;
import Parent.ParentClass;
import util.TestUtil;

public class NewContactPageTest extends ParentClass{

	LoginPage  loginpage;
	HomePage homepage; 
	TestUtil testutil;
	CreateNewContactClass creatingcontact;
	
	
	public NewContactPageTest() {
	
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void login() {
		first();
		testutil = new TestUtil();
		loginpage = new LoginPage();
				homepage = new HomePage();
	     
	     creatingcontact = new CreateNewContactClass();
	     
	    homepage = loginpage.details(pro.getProperty("username"), pro.getProperty("password"));
	}
	@DataProvider
	public Object[] [] data_fill(){
		Object Data [][] = TestUtil.Excel_Data("NewContacts");
		return Data;
	}
	
	@Test(dataProvider = "data_fill" )
	public void CreatingNewContactTest(String title, String FirstName, String LastName, String Company) {
		
		testutil.switchtoframe();
		dri.manage().timeouts().implicitlyWait(testutil.implicitly_wait_2, TimeUnit.SECONDS);
		Actions act = new Actions(dri);
		act.moveToElement(dri.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		dri.manage().timeouts().implicitlyWait(testutil.implicitly_wait_2, TimeUnit.SECONDS);
		dri.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		creatingcontact.Blank_Fills(title, FirstName, LastName, Company);
		
		 
		
		
		
		
	}
		
	
	
	
	
	
	
	
}
