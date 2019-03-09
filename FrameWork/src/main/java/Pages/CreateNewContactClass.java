package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Parent.ParentClass;

public class CreateNewContactClass extends ParentClass {

	
	@FindBy(name = "title")
	WebElement gender;
	@FindBy(id="first_name")
	WebElement Fnme;
	@FindBy(id = "surname")
	WebElement Lnme;
	@FindBy(name = "client_lookup")
	WebElement company;
	@FindBy(xpath = "//input[@name='receive_sms'][value='N']")
	WebElement radio_button;
	@FindBy(xpath="//input[@value='Save']")
	WebElement save_button; 
	
	
	public CreateNewContactClass() {
	PageFactory.initElements(dri, this);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void Blank_Fills(String title,String FFirstName,String LLastName,String CCompany) {
		Select select = new Select(dri.findElement(By.name("title")));
		select.selectByValue(title);
		Fnme.sendKeys(FFirstName);
	Lnme.sendKeys(LLastName);

	company.sendKeys(CCompany);
	radio_button.click();
		
		save_button.click();
		
			}
	
	
	
}
