package Dolibarr.Dolibarr;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DolibarrLogin;
import pages.DolibarrLoginObjects;

public class Dolibarr2 {

	private static WebDriver driver;
	
	//Initialisation de l'instance du driver
	@BeforeClass
	public static void setupClass() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
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
		
		DolibarrLoginObjects loginPageObj= new DolibarrLoginObjects(driver);
		String usernameText="demo";
		String passwordText="demo";
		
		//STEP-1 Démarrage du navigateur Dolibarr
		driver.get("https://demo.dolibarr.org/public/demo/index.php");
		
		
		//STEP-2 Cliquer sur le URL
		DolibarrLogin.pre_URL(driver).click();
		
		/*STEP-3*/
		//Effacer le champ username
		DolibarrLogin.username_textbox(driver).clear();		
		//Saisir login
		loginPageObj.setTextInUserNameTextbox(usernameText);
		
		
		/*STEP-4*/
		//Effacer le champ password
		DolibarrLogin.password_textbox(driver).clear();
		//Saisir Mot de passe
		loginPageObj.setTextInPasswordTextbox(passwordText);
		
		//STEP 5
		//Cliquer sur le bouton
		loginPageObj.clickSeConnecterBouton();
			
	}
}
