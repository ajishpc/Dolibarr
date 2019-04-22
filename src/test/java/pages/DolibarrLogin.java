package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DolibarrLogin {
	private static WebElement element=null;

	public static WebElement pre_URL(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='a1profdemoservonly']/a/div/div[2]"));
		return element;
	}

	public static WebElement username_textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='username']"));
		return element;
	}
	
	public static WebElement password_textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='password']"));
		return element;
	}
	
	public static WebElement se_connecter_bouton(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='login_line2']/input"));
		return element;
	}	
}
