package testSenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BookShel;

public class copywebElements extends BookShel {
	public copywebElements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//sort by low to High
	@FindBy(xpath=" //*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/span")
	public WebElement sortmouse;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]")
	public WebElement selectlowtoHig;
	
	
	public navigettogiftCard sortpricemouse() {
		Actions actioon = new Actions(driver);
		actioon.moveToElement(sortmouse).build().perform();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		selectlowtoHig.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
       
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, navigettogiftCard.class);
	}
	
	//cpoyWebElement
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/ul/li[1]")
	public WebElement fristshelev;
	
	@FindBy(xpath="//*[@id=\'content\']/div[3]/ul/li[2]")
	public WebElement shelev2;
	
	@FindBy(xpath="//*[@id=\'content\']/div[3]/ul/li[3]")
	public WebElement shelev3;
	
	public navigettogiftCard printshelveLowtohige() {
       //First webElementshelves
		System.out.println("*****Frist BookShelve*****");

		String Text1=fristshelev.getText();
		System.out.println(Text1);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		System.out.println("*****Second BookShelve*****");
		
	       //Second webElementshelves
		String Text2=shelev2.getText();
		System.out.println(Text2);

		System.out.println("*****Third BookShelve*****");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		
	       //3rd webElementshelves
		String Text3=shelev3.getText();
		System.out.println(Text3);

		//System.out.println("*****Third BookShelve*****");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		
		return PageFactory.initElements(driver, navigettogiftCard.class);
	}
	
	
	
	
}
