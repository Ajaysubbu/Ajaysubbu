import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsUtiles {
	
	public static void drawborder(WebElement element,WebDriver driver)
	{
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	

}
