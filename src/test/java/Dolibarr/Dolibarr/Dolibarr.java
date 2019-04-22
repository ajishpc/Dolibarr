package Dolibarr.Dolibarr;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DolibarrLogin;


public class Dolibarr {

	private static WebDriver driver;
	
	//Initialisation de l'instance du driver
	@BeforeClass
	public static void setupClass() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/");
	}
	//Setup chrome driver
	@Before
	public void setupTest() {
		driver= new ChromeDriver(); 
		
	}

	@After
	public void teardown() {
		if (driver != null) {
			//driver.quit();
		}
	}	    	
	@Test
	public void test() {

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Démarrage du navigateur Dolibarr
		driver.get("https://demo.dolibarr.org/public/demo/index.php");
		
		
		//Cliquer sur le URL
		DolibarrLogin.pre_URL(driver).click();
		
		//Effacer le champ username
		DolibarrLogin.username_textbox(driver).clear();
		
		//Saisir login
		DolibarrLogin.username_textbox(driver).sendKeys("demo");
		
		//Effacer le champ password
		DolibarrLogin.password_textbox(driver).clear();
		
		//Saisir Mot de passe
		DolibarrLogin.password_textbox(driver).sendKeys("demo");
		
		//Cliquer sur le bouton
		DolibarrLogin.se_connecter_bouton(driver).click();
		
			
	}
}
