package Google_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageFactory {
	
	@FindBy(name="q")
	WebElement txt_GoogleSearch;
	
	@FindBy(xpath="//*[text()='Images']")
	WebElement btn_GoogleSearch;
	
	
	WebDriver driver;
	public GoogleHomePageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	
	public void GoogleSearch_PageFactory() {
		txt_GoogleSearch.sendKeys("Hello World");
		btn_GoogleSearch.click();
	}
	
}
