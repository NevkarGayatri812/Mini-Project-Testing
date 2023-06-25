package testSenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BookShel;

public class nbookGftCrad extends BookShel {

	public nbookGftCrad(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[1]/button[1]")
	public WebElement pricegiftcard;
	
	//DtaeSelect
	@FindBy(xpath="/html/body/div[1]/div/main/section/section[2]/div/section[2]/div[4]/select[2]")
	public WebElement dd;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button")
	public WebElement Next;
	
	public sendBookCardproceduer selectRangegiftCard() {
		
		pricegiftcard.click();
		
		//WebElement dd = driver.findElement(By.xpath("/html/body/div[1]/div/main/section/section[2]/div/section[2]/div[4]/select[2]"));
		Select select=new Select(dd);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		select.selectByValue("24");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Next.click();
		return PageFactory.initElements(driver, sendBookCardproceduer.class);
	}
}
