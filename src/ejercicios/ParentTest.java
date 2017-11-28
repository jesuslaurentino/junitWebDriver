package ejercicios;

import org.apache.http.util.Asserts;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParentTest {
	WebDriver driver;
	String url="https://www.facebook.com";
	By searchBoxLocator = By.name("q");
	
	@Before
	public void setup () {
		 String pathToDriver = "C:\\test_automation\\drivers\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", pathToDriver);
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--lang=es"); 
		 driver = new ChromeDriver(options);
		 driver.get(url);
	}
	@After
    public void tearDown() {
    	driver.close();
    }
	protected void facebookLogin(String user, String password) {
    	String emailId = "email"; 
        String passId = "pass";
        String loginId = "loginbutton";
		WebElement email = driver.findElement(By.id(emailId));
		WebElement pass = driver.findElement(By.id(passId));
		//Agregar wait element is displayed
		WebElement loginB = driver.findElement(By.id(loginId));
		
		 //Introducir texto
        email.clear();
        email.sendKeys(user);
        pass.clear();
        pass.sendKeys(password);
        
        //Click entrar
        loginB.click();
    }
    protected void verifyElementExists(By locator) {
		
		WebElement elementX = driver.findElement(locator);
		Asserts.check(elementX.isDisplayed(), "Element not found.");
		
		
	}
}
