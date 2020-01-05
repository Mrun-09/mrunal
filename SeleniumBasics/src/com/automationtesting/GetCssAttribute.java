package com.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetCssAttribute 
{

	public static void main(String[] args) 
	{
		// Get current working directory
		String internetExplorerDriverExecutableLocation = System.getProperty("user.dir")
				+"\\DriverExecutables\\IEDriverServer.exe";
		
		//Set path of ie driver executable
		System.setProperty("webdriver.ie.driver", internetExplorerDriverExecutableLocation);
		
		//Create an instance of ieDriver class
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		//Enter app URL
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement button=driver.findElement(By.id("loginButton"));
		System.out.println(button.getCssValue("Color"));
	}

}
