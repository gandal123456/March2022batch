package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static WebDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try
		{
		String browserName=(String) inputParameters[0];//chrome
		String exe=(String) inputParameters[1];		    //exe
		if(browserName.equalsIgnoreCase("Chrome"))
		{			
			System.setProperty("webdriver.chrome.driver", exe);
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver", exe);
		     driver=new FirefoxDriver();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return outputParameters;
	}	
	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{
		try
		{
		String url=(String)inputParameters[0];	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> mouseOver(Object[]inputParameters)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String xpath=(String)inputParameters[0];
		
		Actions act=new Actions(driver);
			
		WebElement move=driver.findElement(By.xpath(xpath));
		
		act.moveToElement(move).build().perform();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> sendText(Object[]inputParameters)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String xpath=(String)inputParameters[0];
		String text=(String)inputParameters[1];
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> validationForLogin(Object[]inputParameters)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String givenText=(String)inputParameters[0];
		String xpath=(String)inputParameters[1];
		
		String actualText=driver.findElement(By.xpath(xpath)).getText(); 
		
		if(givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return outputParameters;
	}
	
	
}
