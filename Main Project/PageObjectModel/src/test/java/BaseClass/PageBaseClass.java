package BaseClass;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageClasses.LandingPage;

public class PageBaseClass {
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

	public LandingPage OpenApplication() 
	{
		driver.get("https://www.rediff.com");
		return PageFactory.initElements(driver,LandingPage.class);
	}
	
	public void getTitle(String expectedTitle) 
	{
		//Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
		}
