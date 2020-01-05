package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Selenium Softwares\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement userName=driver.findElement(By.id("admin"));
		userName.sendKeys("mrunal.o.thakare@gmail.com");
		
		WebElement pwdField=driver.findElement(By.name("pwd"));
		pwdField.sendKeys("123");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		System.out.println(driver.getTitle());
		
		WebElement logoutButton=driver.findElement(By.id("logoutButton"));
		logoutButton.click();
	}

}
