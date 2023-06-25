package TestClassses;

import org.testng.annotations.Test;

import BaseClass.PageBaseClass;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.RediffMailPage;

public class WriteMail extends PageBaseClass{

	



	LandingPage landingPage;
	LoginPage loginPage;
	RediffMailPage rediffMailPage;
	PageBaseClass pageBase;
	
	
	@Test
	public void writeMailTest() {
		
		pageBase=new PageBaseClass();
		pageBase.invokeBrowser("chrome");
	    landingPage=pageBase.OpenApplication();
		loginPage=landingPage.clickSignIn();
		rediffMailPage=loginPage.doLogin("khandekarshubham135@gmail.com", "Pass@7579");
		rediffMailPage.clickWriteEmail();
		rediffMailPage.typeEmail();
		//rediffMailPage.getTitle("Rediffmail");
		
		
		
		
	}
}
