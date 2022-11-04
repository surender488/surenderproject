

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 
	public static WebDriver driver;
	
	public static WebDriver ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
		
	}
	public static void urllanuch(String url) {
		driver.get(url);
	}
	
public static void maximize() {
	driver.manage().window().maximize();
	}

public static void implicitwait(long secs) {
	driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS );
}

public static void click(WebElement e) {
	e.click();
	}

public static void  sendkey(WebElement e,String Value) {
	e.sendKeys(Value);
	}

public static void clear(WebElement e) { }
public static void gettext (WebElement e) {
	e.getText();
}

public static String getAttribute(WebElement e) {
	 String attribute = e.getAttribute("value");
	return attribute;

}

public static void selectByIndex(WebElement e,int index){
	Select s=new Select(e);
	s.selectByIndex(index);
	
}













}

