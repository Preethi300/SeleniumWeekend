package allPages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a")
	private WebElement dress;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a")
	private WebElement tshirt;

	@FindBy(xpath = "//strong[text()='You will find here all woman fashion collections.']")
	private WebElement womentext;

	@FindBy(xpath = "//p[text()='Find your favorites dresses from our wide choice of evening, casual or summer dresses!']")
	private WebElement dressestext;

	@FindBy(xpath = "//p[text()='The must have of your wardrobe, take a look at our different colors,']")
	private WebElement tshirtext;
	
	@FindBy(id = "newsletter-input")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(name = "submitNewsletter")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement txtSuccessMessage;
	
	public boolean womenTabDisplay()
	{
		return women.isDisplayed();
	}
	
	public boolean DressTabDisplay()
	{
		return dress.isDisplayed();
	}
	public boolean TshirtTabDisplay()
	{
		return tshirt.isDisplayed(); 
	}

	public void clickDresses() {
		dress.click();
	}
	public void clickWomen()
	{
		women.click();
	}
	public void clickTshirt()
	{
		tshirt.click();
	}
	

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	
	public String getWomenText()
	{
		return womentext.getText();
	}
	public String getDressesText()
	{
		return dressestext.getText();
	}
	public String getTshirtText()
	{
		return tshirtext.getText();
	}
	public void setNewsLetter(String email)
	{
		setText(txtBoxNewsLetter,email);
		btnSubmit.click();
	}
	public String getSuccessMessage()
	{
		return txtSuccessMessage.getText();
	}

		
}
