package testSenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BookShel;

public class bookshelvE extends BookShel {
	public bookshelvE(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//***Mouse Hour

	@FindBy(xpath="//*[@id=\'topnav_wrapper\']/ul/li[6]/span")
	public WebElement moushourinstrege ;
	
	
	
	
	public Bookshelvecl clickSignIn()
	{
		Actions actioon = new Actions(driver);
		actioon.moveToElement(moushourinstrege).build().perform();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		
		
		return PageFactory.initElements(driver,Bookshelvecl.class);
	}
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[6]/div/div/ul/li[1]/ul/li[2]/a/span")
	public WebElement clickbookshel ;

	public Bookshelvecl clickbooksheleve() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clickbookshel);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
				
			try { 
                  Thread.sleep(6000);
            } catch (InterruptedException e)
           {

           e.printStackTrace();
          }

		return PageFactory.initElements(driver,Bookshelvecl.class);

	}

	
							
					
					
					
	
}
