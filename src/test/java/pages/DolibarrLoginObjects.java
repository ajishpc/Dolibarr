package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DolibarrLoginObjects {
	
		WebDriver driver = null;
		
		By username_textbox=By.xpath("//*[@id='username']");
		By password_textbox=By.xpath("//*[@id='password']");
		By se_connecter_bouton=By.xpath("//*[@id='login_line2']/input");
		
		public DolibarrLoginObjects(WebDriver driver) {
			this.driver=driver;
			
		}
		public void setTextInUserNameTextbox(String text) {
			driver.findElement(username_textbox).sendKeys(text);
		}
		public void setTextInPasswordTextbox(String text) {
			driver.findElement(password_textbox).sendKeys(text);
		}
		public void clickSeConnecterBouton() {
			driver.findElement(se_connecter_bouton).sendKeys(Keys.RETURN);
		}
}
