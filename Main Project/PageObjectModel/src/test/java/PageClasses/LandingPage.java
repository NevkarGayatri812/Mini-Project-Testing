package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageBaseClass;

public class LandingPage extends PageBaseClass {


	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	@FindBy(xpath="//a[@title='Already a user? Sign in']")
	public WebElement signIn;
	
	
	public LoginPage clickSignIn()
	{
		signIn.click();
		return PageFactory.initElements(driver,LoginPage.class);
	}
}

