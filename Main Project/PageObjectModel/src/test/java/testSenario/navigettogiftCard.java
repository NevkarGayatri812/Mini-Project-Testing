package testSenario;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BookShel;

public class navigettogiftCard extends BookShel{
	public navigettogiftCard(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[3]/a")
	
	public WebElement gfitcard;
	

	
	public nbookGftCrad slidermousehour() {
		
//		Actions act11=new Actions(driver);
//		act11.dragAndDropBy(Slider1, (int) 0, 100).release().build().perform();
//
//		Slider1.click();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		JavascriptExecutor  slv=(JavascriptExecutor)driver;

		slv.executeScript("window, scrollTo(000,000)");
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

		
		slv.executeScript("window, scrollBy(000,100)");
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		slv.executeScript("window, scrollBy(000,-1000)");
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
			return PageFactory.initElements(driver, nbookGftCrad.class);
	}
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]/div/h3")
	public WebElement BrithdayAnnversary;
	
	public nbookGftCrad GiftCradClick() {
		
		gfitcard.click();
		
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		JavascriptExecutor  slv=(JavascriptExecutor)driver;

		slv.executeScript("window, scrollBy(000,600)");
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		BrithdayAnnversary.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

		return PageFactory.initElements(driver, nbookGftCrad.class);
	}
	
	
}
