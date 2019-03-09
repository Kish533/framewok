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

public class Broken_links_amazon extends ParentClass {
    public static Amazon_LoginPage ama_log;
    public static Amazon_HomePage ama_hme;
	
	
	
	public Broken_links_amazon() {
		// TODO Auto-generated constructor stub
	super();
	}
	
	@BeforeMethod
	public void in() {
		Amazon();
		ama_log = new Amazon_LoginPage();
		
		ama_hme = ama_log.start("9553047766", "533526264");
		
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait_2, TimeUnit.SECONDS);
		
		}
	
	@Test
	public void amazon_login(){
		
	List<WebElement> links = dri.findElements(By.tagName("a"));
	int count = links.size();
	System.out.println("total links are"+ count);
	for(int i=0;i<links.size();i++) {
		WebElement ele = links.get(i);
		String url = ele.getAttribute("href");
		TestUtil.prac(url);

		
		
	}
	
		
		
		
	}
	
	

}
