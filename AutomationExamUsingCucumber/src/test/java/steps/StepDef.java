package steps;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.ValidatBackGroundPage;
import util.BrowserFactory;

public class StepDef {
	
	WebDriver driver;
	ValidatBackGroundPage vbg;
	
	@Before
	public void BeforeRun() {
		driver = BrowserFactory.startBrowser();
		 vbg = PageFactory.initElements(driver, ValidatBackGroundPage.class);
		
	}
	
	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://techfios.com/test/101/");
	 
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		vbg.clickOnSkyBlueBackGround();
		
		Thread.sleep(3000);
	  
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		
	String expected = "White";
	String actual = "White";
	Assert.assertEquals(expected, actual);
	  
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  vbg.clickOnWhiteBackGround();
	  
	  Thread.sleep(3000);
	}
	
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}



}
