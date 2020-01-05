package Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Functionaltesting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","F:\\Selenium\\Selenium Softwares\\Driver\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		testUsernameField();
		testCheckbox();
		testLoginbutton();
	}

	public static void testLoginbutton() 
	{
		WebElement driver = null;
		WebElement Button = driver.findElement(By.id("loginButton"));
		System.out.println("Display : "+Button.isDisplayed());
		System.out.println("Enable : "+Button.isEnabled());
		System.out.println("Button Name is "+Button.getText().equals("Login"));
		System.out.println("Button Color"+Button.getCssValue("Background"));
	}

	public static void testCheckbox() 
	{
		WebElement driver = null;
		WebElement CheckBox = driver.findElement(By.id("Keep logged in CheckBox"));
		System.out.println("Display : "+CheckBox.isDisplayed());
		System.out.println("Enable : "+CheckBox.isEnabled());
		System.out.println("Selection : "+CheckBox.isSelected());
		CheckBox.click();
		System.out.println("After Selection "+CheckBox.isSelected());
		CheckBox.click();
		System.out.println("After Deselection "+CheckBox.isSelected());
	}

	public static void testUsernameField() 
	{
		WebElement driver = null;
		WebElement UserNameField = driver.findElement(By.id("username"));
		System.out.println("Display : "+UserNameField.isDisplayed());
		System.out.println("Enable : "+UserNameField.isEnabled());
		String PlaceHolder=UserNameField.getAttribute("placeholder");
		System.out.println("PlaceHolder" +PlaceHolder);

	}

}
