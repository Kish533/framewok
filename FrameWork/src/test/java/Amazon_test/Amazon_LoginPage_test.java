package Amazon_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPages.Amazon_HomePage;
import AmazonPages.Amazon_LoginPage;
import Parent.ParentClass;
import util.TestUtil;

public class Amazon_LoginPage_test extends ParentClass  {
	
	public static Amazon_LoginPage amazon_loginpage;
	public static Amazon_HomePage  amazon_homepage;
	
	
	public Amazon_LoginPage_test() {
		// TODO Auto-generated constructor stub
		super();
		
	}	
	
	@BeforeMethod
	public void initi() {
		Amazon();
		amazon_loginpage = new Amazon_LoginPage();
		amazon_homepage = amazon_loginpage.start(pro.getProperty("username_1"), pro.getProperty("Password_2"));
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait_2, TimeUnit.SECONDS);
	}
	
	@Test
	public void log() {
		List<WebElement> lis = dri.findElements(By.tagName(""));
		
		int count = lis.size();
		System.out.println(lis);
			
		
		
	}
	
	
	
	

}
