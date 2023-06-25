package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.PageBaseClass;

public class RediffMailPage extends PageBaseClass {
	
	
	public RediffMailPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	
	@FindBy(xpath="//li[@class='rd_write']")
	public WebElement writeMail;
	
	
	@FindBy(xpath="//input[@placeholder='Enter name or email' and @class='rd_inp_to as-input']")
	public WebElement typeMail;
	
	public void clickWriteEmail()
	{
		writeMail.click();
	}
	
	public void typeEmail()
	{
		typeMail.sendKeys();
	}
}
