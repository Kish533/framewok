package toolsqa.Scenarios.Practise;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Parent.ParentClass;
import util.TestUtil;

public class ToolsQa_Senarios extends ParentClass {
	
	static LoginPage loginpage;
	static HomePage homepage;
	
	public ToolsQa_Senarios() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	
	@BeforeMethod
	public static void start() {
		first();
		loginpage = new LoginPage();
		homepage = loginpage.details("Kish533", "#Rkishore1234");
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait_2,TimeUnit.SECONDS);
		}
	@Test
	public static void handlelinks() {
		
		List<WebElement> lin = dri.findElements(By.tagName("a"));
		
		//Iterator<WebElement> itr = new Iterator<WebElement>(lin);
		for(WebElement L : lin) {
			String Link_Names = L.getText();
			System.out.println(Link_Names);
	  /*  List<WebElement> links = dri.findElements(By.tagName("a"));
        int linkcount = links.size(); 
         System.out.println(links.size()); 
          for (WebElement myElement : links){
         String link = myElement.getText(); 
         System.out.println(link);
         System.out.println(myElement);*/
		}
	}
}
