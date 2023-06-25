package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseClass.PageBaseClass {
	
	
	
	private WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	
	@FindBy(xpath="//*[@id='login1']")
	public WebElement username;
	
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement password;
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")
	public WebElement signIn;
	
	public RediffMailPage doLogin(String userName, String Password)
	{
		username.sendKeys(userName);
		password.sendKeys(Password);
		signIn.click();
		String currentPageTitle=driver.getTitle();
		if(currentPageTitle.equalsIgnoreCase("Rediffmail"))
			Assert.fail("Login failed");
		return PageFactory.initElements(driver, RediffMailPage.class);
	}
	
	
}
