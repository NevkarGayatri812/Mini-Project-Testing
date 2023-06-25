package testSenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BookShel;

public class bookshlev extends BookShel{

	public bookshlev(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=" //*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]/div[1]")
	public WebElement pricemouse;
	
	
	public copywebElements pricemouseHour() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions actioon = new Actions(driver);
		actioon.moveToElement(pricemouse).build().perform();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		return PageFactory.initElements(driver,copywebElements.class );
 
	}
	
	@FindBy(xpath="//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]/div[2]/div/div/ul/li[1]/div/div[2]/div[2]/div/div[2]/div")
	public WebElement movePriceSlider;
	
	public copywebElements selesctprice() {
		
		try { 
			Thread.sleep(1000);
			} catch (InterruptedException e)
			{

			e.printStackTrace();
			}

			Actions act11=new Actions(driver);
			act11.dragAndDropBy(movePriceSlider, (int) -244, 0).release().build().perform();

			movePriceSlider.click();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

		
		return PageFactory.initElements(driver, copywebElements.class);
		
		
	}
	
}


