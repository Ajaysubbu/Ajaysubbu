package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("TBM");
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("TJ");
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		Thread.sleep(2000);
		WebElement basetrainlist= driver.findElement(By.xpath("//div[@ id='divTrainsList']//table//tbody")) ;
		List <WebElement> trainrow = basetrainlist.findElements(By.tagName("tr"));
		System.out.println("Totalrows = " + trainrow.size());
		System.out.println( trainrow.size());
		

		System.out.println(" Train Row Values will display " );

		for (int row=0;row<trainrow.size();row++)
		{ 

			//System.out.println(" Train Row Values will display " );
			System.out.println( trainrow.get(row).getText() );
	 
			

		} 



	}

}
