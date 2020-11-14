package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatBackGroundPage {
	
	
WebDriver driver;
	
	public ValidatBackGroundPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")WebElement BACKGROUND_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")WebElement WHITE_BACKGROUND_LOCATOR;
	
	
	public void clickOnSkyBlueBackGround() {
		BACKGROUND_LOCATOR.click();
	}
	
	public void clickOnWhiteBackGround() {
		WHITE_BACKGROUND_LOCATOR.click();
	}

}
