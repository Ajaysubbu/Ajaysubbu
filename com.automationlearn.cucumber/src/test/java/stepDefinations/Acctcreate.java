package stepDefinations;

//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import ListenerImpl.ExtenetReportListner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CreateAcctdetail;
import pages.HomePage;

public class Acctcreate extends  ExtenetReportListner
{
	 WebDriver driver;
	  
	 @Given ("Open the browser (.*) and navigate to Create an acct") 
	public void open_app_click_Signin(String url) throws  Throwable
	{
		 ExtentTest logInfo=null;
try {
	       setUp();
			test =extent.createTest(Feature.class,"Create Account for Auto Pract App");
			test = test.createNode(Scenario.class,"Create Account for Auto Pract App");
			logInfo=test.createNode(new GherkinKeyword("Given"),"open_app_click_Signin ");
			WebDriverManager.chromedriver().browserVersion("85.0.4183.121").setup();
			//driver= BrowserFact.getBrowser("Chrome");
			WebDriver driver= new ChromeDriver();
			driver.get(url); 
			
			HomePage home =PageFactory.initElements(driver, HomePage.class);
			home.clickonsigninLink();
			Thread.sleep(5000);
			
			logInfo.pass("open app click Signin");
			
			}catch (AssertionError    e){
			testStepHandle("FAIL",driver,logInfo,e);
			}catch ( Exception  e){
				testStepHandle("FAIL",driver,logInfo,e);
				}
		
	}
	@When ("Enter the Email (.*) gender and FName (.*) and LName (.*) and Pwd (.*)")
	public void  personalinfo_Enter1(String email,String Fname,String Lname,String pwd) throws Throwable
	{
		 ExtentTest logInfo=null ;
		try {
			
			logInfo=test.createNode(new GherkinKeyword("When"),"personalinfo_Enter1");
			
			CreateAcctdetail CA = PageFactory.initElements(driver, CreateAcctdetail.class);
			CA.Entry_mail_gender_FName_LName_Pwd(email, Fname, Lname, pwd);
			 
			logInfo.pass("Succefully entertered personalinfo_Enter1");
			
			
			  }catch (AssertionError e){
			  logInfo.fail("Not Succefully entertered personalinfo_Enter1");
			  testStepHandle("FAIL",driver,logInfo,e); 
			  }catch ( Exception e){
			  testStepHandle("FAIL",driver,logInfo,e); }
	}
	
     @And ("Enter the Date(.*) and months(.*) and yrs(.*)")
     public void  personalinfo_Enter2(String Days,String months,String years ) throws Throwable
 	{
    	 ExtentTest logInfo=null ;
    	 try {		
    		    logInfo=test.createNode(new GherkinKeyword("And"),"personalinfo_Enter2");
    		    
    		    CreateAcctdetail CA = PageFactory.initElements(driver, CreateAcctdetail.class);
    	 		CA.Entry_Date_months_yrs(Days, months, years);
    		    
    	 		logInfo.pass("Succefully entertered personalinfo_Enter2");
    			
 		}catch (AssertionError    e){
 		testStepHandle("FAIL",driver,logInfo,e);
 		}catch ( Exception  e){
 			testStepHandle("FAIL",driver,logInfo,e);
 			}
 	}
     @And("Enter the Company(.*) and Address1(.*) and Addr2(.*)")
     public void  Enter_personalinfo3(String Comp,String Addr1,String Addr2 ) throws Throwable
  	{
    	 ExtentTest logInfo=null ;
    	 try {		
    		    logInfo=test.createNode(new GherkinKeyword("And"),"Enter_personalinfo3");
    		    
    		    CreateAcctdetail CA = PageFactory.initElements(driver, CreateAcctdetail.class);
    	  		CA.Entry_Company_Address1_Addr2(Comp, Addr1, Addr2);
    	  		
    			logInfo.pass("Succefully entertered personalinfo_Enter3");
    			
  		}catch (AssertionError    e){
  		testStepHandle("FAIL",driver,logInfo,e);
  		}catch ( Exception  e){
  			testStepHandle("FAIL",driver,logInfo,e);
  			}
  	}
 	@And("Enter City(.*) and State(.*) and Zip(.*)")
 	public void  Enter_personalinfo4(String city,String state,String zip ) throws Throwable
 	{
 		 ExtentTest logInfo=null ;
 		
 		try {		
 		    logInfo=test.createNode(new GherkinKeyword("And"),"Enter_personalinfo4");
 		    
 		   CreateAcctdetail CA = PageFactory.initElements(driver, CreateAcctdetail.class);
 	  		 CA.Enter_City_State_Zip(city, state, zip);
 	  		 
 			logInfo.pass("Succefully entertered personalinfo_Enter4");
			
  		}catch (AssertionError    e){
  		testStepHandle("FAIL",driver,logInfo,e);
  		}catch ( Exception  e){
  			testStepHandle("FAIL",driver,logInfo,e);
  			}
 	
  	}
 	@And("Enter AddlInfo(.*) and Home phone(.*) and Mobile Phone (.*) and alais(.*)")
 	public void  Enter_personalinfo5(String AddlInfo,String Homephone,String Mob,String alias ) throws Throwable
 	{
 		 ExtentTest logInfo=null;
 		try {		
 		    logInfo=test.createNode(new GherkinKeyword("And"),"Enter_personalinfo5");
 		    
 		   CreateAcctdetail CA = PageFactory.initElements(driver, CreateAcctdetail.class);
 	  	   CA.Entry_AddlInfo_Homephone_MobilePhone_alais(AddlInfo, Homephone, Mob, alias);
 	  	   
 	  	logInfo.pass("Succefully entertered personalinfo_Enter5");
		
  		}catch (AssertionError    e){
  		testStepHandle("FAIL",driver,logInfo,e);
  		}catch ( Exception  e){
  			testStepHandle("FAIL",driver,logInfo,e);
  			}		 
 	}	 
 	@Then("Verify the acct Name as Fname(.*) and Lname(.*) for loggedin Acct")
 	public void  Verification_Acct_name(String Fname,String LName) throws Throwable
 	{
 		ExtentTest logInfo=null;
 		try {		
 		    logInfo=test.createNode(new GherkinKeyword("Then"),"Verification_Acct_name");
 		    
 		   CreateAcctdetail CA = PageFactory.initElements(driver, CreateAcctdetail.class);
 	  	   CA.Verify_acctName_as_Fname_Lname_loggedinAcct(Fname, LName);
 	  	   
 	  	   
			/*
			 * extent.flush(); driver.close();
			 */
	logInfo.pass("Succefully verified the Acct name");
	extent.flush();
	driver.quit();
		
  		}catch (AssertionError    e){
  		testStepHandle("FAIL",driver,logInfo,e);
  	     
  		}catch ( Exception  e){
  			testStepHandle("FAIL",driver,logInfo,e);
  			}
 	}
 	
	
}
 	

