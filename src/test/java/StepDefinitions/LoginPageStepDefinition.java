package StepDefinitions;

import PagePackage.LoginPageClass;
import cucumber.api.java.en.And;

public class LoginPageStepDefinition extends LoginPageClass{

	@And ("^I want to highlight the elements$")
	public static void i_want_highlight (){
		highLight();
	}
	
	@And ("^I want to close the application$")
	public static void want_to_close (){
		closeBrowser();
	}
	
	@And ("^I want to get a text value \"(.*)\"$")
	public static void want_to_get_text (String xpathVal){
		getAValue (xpathVal);
		//highLight();
	}

	@And ("^I want to mouse hover to the element$")
	public static void mouse_hover_to_element (){
		mouseHover();
	}
	
	
	
	
}
