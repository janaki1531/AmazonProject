package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
	
	public static WebDriver driver;
	//open browser
	public static void openBrowser(String browser){
		try{
			
			/*WebDriverWait wait = new WebDriverWait(driver, 80);
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
			ele.click();*/
			
			if (browser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\amazonProject\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("IE")){
				//code
			}
			else if (browser.equalsIgnoreCase("Gecko")){
				//code
			}
			else{
				System.out.println("Invalid broser selection");
			}
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}

	public static void navigateURL (String url){
		try{
			driver.manage().window().maximize();
			driver.get(url);
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	public static void enterText (String ObjectXpath, String enterValue){
		try{
			driver.findElement(By.xpath(ObjectXpath)).sendKeys(enterValue);
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	public static void clickButton (String objectXpath){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 80);
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(objectXpath)));
			ele.click();
			//driver.findElement(By.xpath(objectXpath)).click();
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}

	public static void selectItem (String ObjectXpath, String selectValue){
		try{
			WebElement element = driver.findElement(By.xpath(ObjectXpath));
			Select select = new Select(element);
			select.selectByVisibleText(selectValue);
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	public static void closeBrowser (){
		try{
			driver.close();
			driver.quit();
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	//junit
	//cucumber-java 1.2.5
	//cucumber-junit 1.2.5
	//cucumber-jvm-deps 1.0.5
	//selenium 3.11
	
	
	
	
	
}
