package PagePackage;

import org.openqa.selenium.JavascriptExecutor;

import Keywords.CommonActions;

public class HomePageClass extends CommonActions{
	
	public static void loginFunction (String xpath, String value){
		try{
			enterText("", xpath);
			enterText("", value);
			clickButton("");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	

}
