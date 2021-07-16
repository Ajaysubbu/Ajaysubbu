package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import static org.junit.Assert.assertEquals;

import junit.framework.Assert;

import static org.junit.Assert.assertTrue;

public class CreateAcctdetail {
	WebDriver driver;
	public CreateAcctdetail(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	@FindBy(id="email_create") WebElement  Email;
	@FindBy(id="SubmitCreate") WebElement  Submit_button;
	@FindBy(id="id_gender1") WebElement  Gender;
	@FindBy(id="customer_firstname") WebElement  Firstname;
	@FindBy(id="customer_lastname") WebElement LastName;
	@FindBy(id="passwd") WebElement Pwd;
	@FindBy(id="days") WebElement Day1;
	@FindBy(id="months") WebElement Mons;
	@FindBy(id="years") WebElement yrs;
	@FindBy(id="optin") WebElement Offers;
	@FindBy(id="company") WebElement comp;
	@FindBy(id="address1") WebElement Add1;
	@FindBy(id="address2") WebElement Add2;
	@FindBy(id="city") WebElement City;
	@FindBy(id="id_state") WebElement State;
	@FindBy(id="postcode") WebElement Zipcode;
	@FindBy(id="other") WebElement Other;
	@FindBy(id="phone") WebElement Ph;
	@FindBy(id="phone_mobile") WebElement Mobile;
	@FindBy(id="alias") WebElement Alias;
	@FindBy(id="submitAccount") WebElement submitAcctbutton;
	@FindBy(className="account") WebElement Acctname;
	@FindBy(id="create_account_error") WebElement Errmsg;
	public void Entry_mail_gender_FName_LName_Pwd(String email,String Fname,String Lname,String pwd) throws Throwable
	{
		Email.sendKeys(email);
		Submit_button.click();
		Thread.sleep(5000);
		Gender.click();	 
		Firstname.sendKeys(Fname); 
		LastName.sendKeys(Lname); 
		Pwd.sendKeys(pwd);
	}
	
	public void Entry_Date_months_yrs (String Days,String months,String years) throws Throwable
	{
		Thread.sleep(5000);
		Select dob1= new Select(Day1);
				dob1.selectByValue(Days);
		Thread.sleep(5000);		
		Select dob2= new Select(Mons);
				dob2.selectByValue(months);
				
				Select dob3= new Select(yrs);
						dob3.selectByValue(years);
						Offers.click();	
	}
	public void Entry_Company_Address1_Addr2 (String Comp,String Addr1,String Addr2)
	{
		comp.sendKeys(Comp);
		Add1.sendKeys(Addr1);
		Add2.sendKeys(Addr2);
		
	}
	
	public void Enter_City_State_Zip (String city,String state,String zip)
	{
		City.sendKeys(city);
		Select State1= new Select(State);
				State1.selectByValue(state);
		Zipcode.sendKeys(zip);
	}
	
	public void Entry_AddlInfo_Homephone_MobilePhone_alais(String AddlInfo,String Homephone,String Mob,String alias)
	{
		Other.sendKeys(AddlInfo);
		Ph.sendKeys(Homephone);
		Mobile.sendKeys(Mob);
		Alias.sendKeys(alias);
		submitAcctbutton.click();
	}

	 
 
	public void Verify_acctName_as_Fname_Lname_loggedinAcct(String Fname,String LName)
	{
		String Actual=Acctname.getText();
		//String Expected = Fname+" "+LName ;
		  String Expected = Fname;
		/*
		 * if (Actual.equalsIgnoreCase(Fname)) //if
		 * (Actual.equalsIgnoreCase(Fname+" "+LName )) {
		 * System.out.println("Account name is " +Actual); }
		 */
		Assert.assertEquals( Expected, Actual," Account name is not Matching");
	}
	
	/*
	 * @SuppressWarnings("deprecation") public void
	 * Error_messg_Validation_invalid_mail() { String Actual = Errmsg.getText();
	 * String expected= "Invalid email address."; if
	 * (Actual.equalsIgnoreCase(expected)) {
	 * System.out.println("Error msg for invaild mail is correct"); } else {
	 * Assert.fail("Error msg for invail mail is incorrect");
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
}
