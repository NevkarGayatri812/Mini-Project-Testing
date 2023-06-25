package BaseClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testSenario.bookshelvE;

public class BookShel {
public WebDriver driver;
	
	public void invokeBrowser(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayvant\\eclipse-workspaces\\PageObjectModel\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else
			
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Jayvant\\eclipse-workspaces\\PageObjectModel\\driver\\geckodriver.exe");
				}catch (Exception e) {
				System.out.println(e.getMessage());
			
			
		}

		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}

	public bookshelvE OpenApplication() 
	{
		driver.get("https://www.urbanladder.com/");
		return PageFactory.initElements(driver,bookshelvE.class);
	}
	
	public  bookshelvE verify() 
	{
		System.out.println("verify page Title");
		
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		
		Assert.assertEquals(currentPageTitle,"Up to 70% off on Online Furniture | Full House Sale - Urban Ladder");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		return PageFactory.initElements(driver, bookshelvE.class);
	}
	

}
