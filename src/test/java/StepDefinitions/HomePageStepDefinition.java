package StepDefinitions;

import PagePackage.HomePageClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefinition extends HomePageClass {
	
	@Given ("^I want to open browser \"(.*)\"$")
	public void want_open_browser (String browser){
		openBrowser(browser);
	}
	

	@And ("^I want to launch the application \"(.*)\"$")
	public void want_launch_app (String url){
		navigateURL(url);
	}
	
	@And ("^I want to enter to text box \"(.*)\" and a value is \"(.*)\"$")
	public void want_enter_value (String xpath, String value){
		enterText(xpath, value);
	}
	
	@Then ("^I want to click on \"(.*)\" text box$")
	public void want_click_button (String xpath){
		clickButton(xpath);
	}

@Then("^I want to launch application \"([^\"]*)\"$")
public void i_want_to_launch_application(String url) {
	navigateURL(url);
   
}
}
