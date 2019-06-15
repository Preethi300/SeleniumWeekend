package testPages;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import allPages.BasePage;
import allPages.HomePageObjects;

public class HomePage {

	HomePageObjects hp;
	BasePage bp;

	public HomePage() {
		hp = new HomePageObjects();
		bp = new BasePage();
	}
	int number=new Random().nextInt(50000);
	String email="Batch6Auto" + number + "@gmail.com";

	

	@Test
	public void verifyDifferentTabDisplay() {
		Assert.assertTrue(hp.womenTabDisplay(), "Failed: Women tab not displayed");
		Assert.assertTrue(hp.DressTabDisplay(), "Failed: Dress tab not displayed");
		Assert.assertTrue(hp.TshirtTabDisplay(), "Failed: Tshirt tab not displayed");
		
	}
	
	@Test
	public void verifyPagedisplay()
	{
		hp.clickWomen();
		String wtxt=hp.getWomenText();
		Assert.assertTrue(wtxt.equals("You will find here all woman fashion collections."), "Failed: Women page not displayed");
		
		hp.clickDresses();
		String drestxt=hp.getDressesText();
		Assert.assertTrue(drestxt.equals("Find your favorites dresses from our wide choice of evening, casual or summer dresses!"), "Failed: Dresses page not displayed");
			
		hp.clickTshirt();
		String tstxt=hp.getTshirtText();
		Assert.assertTrue(tstxt.equals("The must have of your wardrobe, take a look at our different colors,"), "Failed: Tshirt page not displayed");

			}
	
	@Test
	public void verifySubscription() {
		hp.setNewsLetter(email);
		String msg=hp.getSuccessMessage();
		Assert.assertTrue(msg.contains("successfully"), "Failed:Subscription not displayed");
	}
}


	





