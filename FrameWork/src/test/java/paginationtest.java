import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Parent.ParentClass;

public class paginationtest extends ParentClass{

	public paginationtest() {
		// TODO Auto-generated constructor stub
		super();
	}
	@BeforeMethod
	public void s() {
	Amazon();
	}
	@Test
	public static void sclues() throws IOException, InterruptedException { 
		 
		//"http://www.shopclues.com/" 
		//Click on Computers 
		
		dri.findElement(By.xpath("//div[text()='Computers']")).click(); 
		//Click On View All 
		dri.findElement(By.xpath("(//a[@href='computers/laptops.html' and text()=' View All'])[1]")).click();

		//List pagination =(List) driver.findElements(By.xpath("//a[@name='pagination'][2]")); 
		List pagination =(List) dri.findElements(By.xpath("//div[@class='pagination cm-pagination-wraper center']//a"));

		pagination.size(); 
		System.out.println(pagination.size()); 
		if(pagination .size()>0){ 
		System.out.println("pagination exists");

		// click on pagination link

		for(int i=0; i<pagination.size(); i++){ 
		 ((WebElement) pagination.get(i)).click();


		} 
		} else { 
		System.out.println("pagination not exists"); 
		} 
		} 
		}

