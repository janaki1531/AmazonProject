package PagePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Keywords.CommonActions;

public class LoginPageClass extends CommonActions{

	public static void highLight (){
		try{
			Thread.sleep(2000);			
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='a-column a-span2 dashboard-nav-6-col']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			for (WebElement ele : element){				 
				Thread.sleep(1000);
				js.executeScript("arguments[0].style.border='3px solid red'", ele);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
				Thread.sleep(1000);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void getAValue (String xpath){
		try{
			 
					WebElement b = driver.findElement(By.xpath(xpath));
					String a = b.getText();
			System.out.println("The amazon pay value is - " + a);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void mouseHover () {
		try{
			WebElement ele = driver.findElement(By.xpath("//a[@id='gf-fbtn']"));
			Actions builder = new Actions(driver);
            Action mouseOverHome = builder
                    .moveToElement(ele)
                    .click()
                    .keyDown(ele, Keys.DOWN)
                    .build();
            mouseOverHome.perform();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
