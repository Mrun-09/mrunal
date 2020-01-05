package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class VtigerLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Selenium Softwares\\Driver\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/");
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("admin");
		
		WebElement pwdField = driver.findElement(By.name("pwd"));
		pwdField.sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		System.out.println("driver.getTitle()");
		
		WebElement logoutButton = driver.findElement(By.id("logoutButton"));
		logoutButton.click();
	}

}
