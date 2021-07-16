package com.testgroup.Artifacttest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlineCheckout {
	    WebDriver driver;
		WebElement Style_checkbox, ele;
		int Styles_count;
	public static void main(String[] args)    {   
		//System.setProperty("webdriver.chrome.driver", "D:\\Standalone_jar\\Firefox\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().browserVersion("86.0.4240.183").setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("aj@jj.com");
		driver.findElement(By.id("passwd")).sendKeys("ajay1234");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")).click();
		WebElement StyleChk = driver.findElement(By.id("ul_layered_id_feature_6"));
		List<WebElement> ele = StyleChk.findElements(By.tagName("li"));
		for (WebElement elevalue : ele) {
			String elestr = elevalue.getText();
			System.out.println(elestr);
			if (elestr.contains("Girly")) {
				WebElement divtag = elevalue.findElement(By.tagName("div"));
				boolean span = divtag.findElement(By.tagName("span")).getAttribute("class").equals("checked");
				System.out.println(span);
				if (!span) {
					divtag.click();
					break;
				}
				break;

			}
		}

		Select sortby =new Select(driver.findElement(By.id("selectProductSort")));
		driver.findElement(By.id("selectProductSort")).click();
		sortby.selectByVisibleText("In stock");
		driver.findElement(By.id("search_query_top")).sendKeys("Faded short sleeve t-shirt");
		driver.findElement(By.name("submit_search")).click();

		//driver.findElement(By.xpath("//span[contains(text(),'Quick view')]")).click();

		Actions cursor=new Actions (driver); WebElement
		src=driver.findElement(By.xpath("//div[@class='product-image-container']"));
		cursor.clickAndHold(src).perform();	 			
		driver.findElement(By.xpath("//a[@class='quick-view']")).click();
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame( iframe);
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		driver.findElement(By.id("add_to_cart")).click();
		/*
		 * String Msg1 =
		 * driver.findElement(By.xpath("//i[@class='icon-ok']")).getText();
		 * System.out.println(Msg1); 
		 * if
		 * (Msg1.equals("Product successfully added to your shopping cart")) {
		 * System.out.
		 * println("Product Success msg for shopping cart is same as expected msg"); }
		 * else {
		 * Assert.fail("Product Success msg for shopping cart is same as expected msg");
		 * }
		 */
		
		driver.switchTo().parentFrame();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		WebElement Msg = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		String AlertMsg= Msg.getText();
		System.out.println(AlertMsg);
		if (AlertMsg.equals("Product successfully added to your shopping cart")) 
		{
			System.out.println("Product Success msg for shopping cart is same as expected msg"); 
		}
		else {
		  Assert.fail("Product Success msg for shopping cart is not same as expected msg");
		    }
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);   
		driver.findElement(By.className("cross")).click();					
		driver.findElement(By.className("ajax_cart_product_txt_s")).click();
		WebElement Cart_Title = driver.findElement(By.xpath("//h1[@id='cart_title']"));
		String Cart_summ_Title = Cart_Title.getText();
		System.out.println(Cart_summ_Title);
		if (Cart_summ_Title.contains("SHOPPING-CART SUMMARY"))
		{
			System.out.println("Cart summary Title is same as expected");
		}
		else
		{
			Assert.fail("Cart summary Title is not same as expected");
		}
		WebElement P_table = driver.findElement(By.xpath("//table[@id='cart_summary']//tbody"));

		List<WebElement> Prod = P_table.findElements(By.tagName("tr")); 

		for (int row=0;row<Prod.size();row++)
		{
			String Data1 =Prod.get(row).getText();
			if  (Data1.contains("Faded Short Sleeve T-shirts"))
			{		 
				System.out.println(" Product name is Faded Short Sleeve T-shirts"  );
			}
			else 
				Assert.fail("Product name is not same as expected");
			if  (Data1.contains("$33.02"))
			{
				System.out.println(" Price of the Product is same as expected "  );
			}
			else
				Assert.fail("Product name is not same as expected");
		}
		WebElement Quantity = driver.findElement(By.xpath(" //input[@name='quantity_1_1_0_323548']"));
		String   ActualQty=Quantity.getAttribute("value");
		if (ActualQty.equals("2"))
		{
			System.out.println(" Quantity of Product is same as expected"  );	
		}
		else
		{
			Assert.fail(" Quantity of Product is not expected");
		}
		String Summary_tab_chk =driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[1]")).getAttribute("class");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(Summary_tab_chk);
		 
		 if (Summary_tab_chk.contains("step_current") )
			{
				System.out.println("Summary tab of cart is selected");	
			}
			else
			{
				Assert.fail("Summary tab of cart is not selected");
			}
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
		WebElement Addrs_chk= driver.findElement(By.xpath("//div[@id='uniform-addressesAreEquals']"));
		boolean Addr_selection = Addrs_chk.findElement(By.tagName("span")).getAttribute("class").equals("checked");
		if (Addr_selection= true)
		{
			System.out.println("Address is Selected in address tab of Cart page");
		}
		else
		{
			Assert.fail("Address is not Selected in address tab of Cart page");
		}
		String Address_tab_chk =driver.findElement(By.xpath(" //*[@id=\"order_step\"]/li[3]")).getAttribute("class");
		
		 System.out.println(Address_tab_chk);
		 
		 if (Address_tab_chk.contains("step_current") )
			{
				System.out.println("Address tab of cart is selected");	
			}
			else
			{
				Assert.fail("Address tab of cart is not selected");
			}
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		WebElement Shipping_radio= driver.findElement(By.xpath("//div[@id='uniform-delivery_option_323548_0']"));
		boolean Shipping_selection = Shipping_radio.findElement(By.tagName("span")).getAttribute("class").equals("checked");
		if (Shipping_selection= true)
		{
			System.out.println("Shipping is Selected in Shipping tab of Cart page");
		}
		else
		{
			Assert.fail("Shipping is not Selected in Shipping tab of Cart page");
		}
		String Shipping_tab_chk =driver.findElement(By.xpath(" //*[@id=\"order_step\"]/li[4]")).getAttribute("class");
		
		 System.out.println(Shipping_tab_chk);
		 
		 if (Shipping_tab_chk.contains("step_current") )
			{
				System.out.println("Shipping tab of cart is selected");	
			}
			else
			{
				Assert.fail("Shipping tab of cart is not selected");
			}

		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
		driver.switchTo().parentFrame();
		WebElement err= driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/div/div"));
		System.out.println(err.getText());
				if (err.getText().equals ("You must agree to the terms of service before continuing."))
		{
			System.out.println("Actual errmsg of term cond check is same as expected Message"); 
			 
		}
			  else {
		  Assert.fail("Actual errmsg of term cond check is not same as expected Message");
		  }
		driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/a ")).click();
		driver.findElement(By.xpath("//div[@id='uniform-cgv']//span")).click();
		
		
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
		String Payment_tab_chk =driver.findElement(By.xpath("//*[@id=\"step_end\"]")).getAttribute("class");
		
		 System.out.println(Payment_tab_chk);
		 
		 if (Payment_tab_chk.contains("step_current") )
			{
				System.out.println("Payment tab of cart is selected");	
			}
			else
			{
				Assert.fail("Payment tab of cart is not selected");
			}
		driver.findElement(By.xpath(" //a[@class='cheque']")).click();
		String Paymentmode = driver.findElement(By.xpath("//p[@class='cheque-indent']")).getText();
		System.out.println(Paymentmode);
		if (Paymentmode.equals("You have chosen to pay by check. Here is a short summary of your order:"))
		{
			System.out.println("Payment mode chosen by check"); 
			 
		}
			  else {
		  Assert.fail("Payment mode chosen by bank wire");
			  }
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		String Success_Msg =driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		System.out.println(Success_Msg);
		
		if (Success_Msg.equals("Your order on My Store is complete."))
		{
			System.out.println("Order alert message is same as expected"); 
			 
		}
			  else {
		  Assert.fail("Order alert message is not same as expected");
		
	}

			   
	}	}




