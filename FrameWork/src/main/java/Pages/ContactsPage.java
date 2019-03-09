package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import Parent.ParentClass;

public class ContactsPage extends ParentClass{
	public void checkclick(String name) {
	dri.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
			+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();

	}
	

	
	
} 
