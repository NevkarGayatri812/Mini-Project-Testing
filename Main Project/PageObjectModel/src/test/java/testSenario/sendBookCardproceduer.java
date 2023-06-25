package testSenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.BookShel;

public class sendBookCardproceduer extends BookShel {

	public sendBookCardproceduer(WebDriver driver)
	{
		this.driver=driver;
	}
	//To
	@FindBy(xpath="//*[@id=\"ip_4036288348\"]")
	public WebElement Recepanetsname;
	
	@FindBy(xpath="//*[@id=\"ip_137656023\"]")
	public WebElement RecepanetsEmail;
	
	@FindBy(xpath="//*[@id=\"ip_3177473671\"]")
	public WebElement RecepanetsMobileno;
	
	public void RecepanetData() {
		
		Recepanetsname.sendKeys("Shoaib Mirajkar ");
		
		RecepanetsEmail.sendKeys("shoaibmirajkar@gmail.com ");
		try { 
			Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				
			}

		
		RecepanetsMobileno.sendKeys("9999985641");
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}

	}
	
	//from data
	@FindBy(xpath="//*[@id=\"ip_1082986083\"]")
	public WebElement name;
	
	@FindBy(xpath="//*[@id=\"ip_4081352456\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[@id=\"ip_2121573464\"]")
	public WebElement phoneno;
	
	@FindBy(xpath="//*[@id=\"ip_2194351474\"]")
	public WebElement address;
	
	@FindBy(xpath="//*[@id=\"ip_567727260\"]")
	public WebElement pincod;
	
	@FindBy(xpath="//*[@id=\"ip_582840596\"]")
	public WebElement textmasege;
	
	@FindBy(xpath="//button[@class='_3Hxyv _1fVSi action-button _1gIUf _1XfDi']")
	public WebElement confirm;
	
	public void ToData() {
		name.sendKeys("Suraj Dixit ");
		email.sendKeys("surajdixit@gmail.com");
		try { 
			Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				
			}

		phoneno.sendKeys("885635223");
		address.sendKeys("bhandarkar road");
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}

		pincod.sendKeys("411040");
		textmasege.sendKeys("WellCome Back");
		confirm.click();
		try { 
			Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				
			}

		phoneno.clear();
		try { 
			Thread.sleep(4000);
			} catch (InterruptedException e)
			{
				
			}

		phoneno.sendKeys("8856352235");
		try { 
			Thread.sleep(4000);
			} catch (InterruptedException e)
			{
				
			}
		
		confirm.click();
		
		try { 
			Thread.sleep(4000);
			} catch (InterruptedException e)
			{
				
			}
		
		driver.quit();


	}
	
	
}
