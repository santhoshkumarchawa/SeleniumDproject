package Google_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {
	
		WebDriver driver;
		By txt_GoogleSearch=By.name("q");
		By btn_GoogleSearch=By.xpath("//*[text()='Images']");
		
		
		public GoogleHomePage(WebDriver driver)
		{
			this.driver=driver;
		}
		public void EnterText(String Entertext)
		{
			driver.findElement(txt_GoogleSearch).sendKeys(Entertext);
		}
		
		public void ClickButton()
		{
			//driver.findElement(btn_GoogleSearch).click();
			driver.findElement(By.id("Value")).sendKeys(Keys.ENTER); 
		}
		
		public void GoogleSearch()
		{
			driver.findElement(txt_GoogleSearch).sendKeys("SeleniumTest"); 
			driver.findElement(btn_GoogleSearch).click();
		}
		
		
		
}
