package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Standalone jar\\Firefox\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		  WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.findElement( By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement( By.name("txtPassword")).sendKeys("admin123");
		 WebElement ele =driver.findElement( By.name("txtPassword"));
		
		 driver.findElement(By.name("Submit")).click();
		 driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		 
		 driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();
		 driver.findElement(By.xpath("//a[@id='menu_admin_viewEducation']")).click();
			 
       driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/b[1]")).click();
       List<WebElement>Check_box = driver.findElements(By.name("chkListRecord[])"));
      int chk_box =Check_box.size();
      
      for (int i=0;i<chk_box;i++)
      {
    	  WebElement ck = Check_box.get(i);
    	  String ck_value = ck.getAttribute("value");
    	  System.out.println("Education Levels are " +ck_value );
    	  
      }
      }
        
	};


