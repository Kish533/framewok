 package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parent.ParentClass;

public class HomePage extends ParentClass {
	
	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement calender;
	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	WebElement company;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contact;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement deal;



public HomePage() {
	PageFactory.initElements(dri, this);
	
}
    public CalanderPage CalPage() {
    	calender.click();
    	return new CalanderPage();
    	

}

  public CompaniesPage CompPage() {
	  company.click();
	  return new CompaniesPage();
}
     public ContactsPage ContPage() {
      contact.click();
      return new ContactsPage();
      
}
          public DealsPage DlsPage() {
deal.click();
        return new DealsPage();
        	  
}
}

