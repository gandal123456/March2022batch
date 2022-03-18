package plainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase 
{

	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "G:\\March2022FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		//cancle initial LoginPage
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		//mouse over on Login
		Actions act=new Actions(driver);
		
		WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		
		act.moveToElement(abc).build().perform();
		Thread.sleep(2000);
		
		//click on My profile
		driver.findElement(By.xpath("(//*[@class='_2NOVgj'])[1]")).click();
		Thread.sleep(2000);
		//enter username
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9168313434");
		
		//enter password
		driver.findElementByXPath("//*[@type='password']").sendKeys("abcd@321");
		
		//click on Login
		driver.findElementByXPath("(//*[text()='Login'])[3]").click();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
