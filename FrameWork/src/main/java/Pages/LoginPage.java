package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parent.ParentClass;

public class LoginPage extends ParentClass {
	
	@FindBy(name="username")
	WebElement usrnme;
	@FindBy(name="password")
	WebElement psswd;
	@FindBy(xpath= "//input[@value='Login']")
	WebElement submit;
	
	public  LoginPage() {
		PageFactory.initElements(dri, this);
		
	}
	
	public HomePage details(String usn, String pwd) {
		usrnme.sendKeys(usn);
		psswd.sendKeys(pwd);
		submit.click();
		return new HomePage();
		
	}

}
