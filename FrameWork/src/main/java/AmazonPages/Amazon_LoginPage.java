package AmazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parent.ParentClass;

public class Amazon_LoginPage extends ParentClass {
	
	@FindBy(name="email")
	WebElement USRNME;
	@FindBy(id="continue")
	WebElement CONT_Buttn;
	@FindBy(id="ap_password")
	WebElement PSWD;
	
	@FindBy(id="signInSubmit")
	WebElement sub_btn;
	
	public Amazon_LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dri, this);
		
	}
	
 public  Amazon_HomePage start(String un,String pwd) {
	// TODO Auto-generated method stub
	 
	 USRNME.sendKeys(un);
	 CONT_Buttn.click();
	 PSWD.sendKeys(pwd);
	 sub_btn.click();
	 
	 return new Amazon_HomePage();

}
	
	
	

}
