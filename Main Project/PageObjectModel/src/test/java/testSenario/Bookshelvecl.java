package testSenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookshelvecl extends BaseClass.BookShel  {
	public Bookshelvecl(WebDriver driver)
	{
		this.driver=driver;
	}
	//   Add
	@FindBy(xpath="//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")
	public WebElement Add ;
	
	public bookshlev Addclose() {
		Add.click();
		
		return PageFactory.initElements(driver,bookshlev.class );
	}
	
	
	//ExcludeOutOfStock checkBox
	
	@FindBy(xpath="//*[@id=\"filters-form\"]/div[2]/div/label")
	public WebElement ExcludeOutOfStock; 
	public bookshlev ExcludeOutOfStock() {
		ExcludeOutOfStock.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		return PageFactory.initElements(driver, bookshlev.class);
	}
	
}
