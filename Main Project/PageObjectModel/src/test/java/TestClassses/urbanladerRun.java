package TestClassses;

import org.testng.annotations.Test;

import BaseClass.BookShel;
import testSenario.Bookshelvecl;
import testSenario.bookshelvE;
import testSenario.bookshlev;
import testSenario.copywebElements;
import testSenario.navigettogiftCard;
import testSenario.nbookGftCrad;
import testSenario.sendBookCardproceduer;

public class urbanladerRun {
	
	sendBookCardproceduer selectprice;
	nbookGftCrad clickgiftcart;
	navigettogiftCard GiftCardNavigate;
	copywebElements price;
	bookshlev add;
	Bookshelvecl bookshelclick;
	bookshelvE landingPage;
	BookShel pageBase;
	
	
	@Test
	public void MainProject() {
		
		pageBase=new BookShel();
		pageBase.invokeBrowser("chrome");
	    landingPage=pageBase.OpenApplication();
	    landingPage=pageBase.verify();
	    bookshelclick= landingPage.clickSignIn();
	    bookshelclick= landingPage.clickbooksheleve();
         add=bookshelclick.Addclose();
         add=bookshelclick.ExcludeOutOfStock();
         price=add.pricemouseHour();
         price=add.selesctprice();
         GiftCardNavigate=price.sortpricemouse();
         GiftCardNavigate=price.printshelveLowtohige();
         clickgiftcart=GiftCardNavigate.slidermousehour();
         //reEnter
         clickgiftcart=GiftCardNavigate.GiftCradClick();
         selectprice=clickgiftcart.selectRangegiftCard();
         selectprice.RecepanetData();
         selectprice.ToData();
         //details of booking
         
         
         
	}
}
