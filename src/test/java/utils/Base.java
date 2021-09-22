package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;
	public static WebDriver LaunchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public void openURL(String url)
	{
		driver.get(url);
	}
	public void type(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void tap(WebElement element) {
		element.click();
	}
	public void CloseBrowser() {
		driver.close();
	}
	public void maxi()
	{
		driver.manage().window().maximize();
	}
 public void iwait(int time) {
	 driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	 
 }
}
