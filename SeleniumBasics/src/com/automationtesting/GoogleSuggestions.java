package com.automationtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSuggestions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Selenium Softwares\\Driver\\IEDriverServer.exe");
		/* crate an instance of InternetExplorer class */
		WebDriver driver = new InternetExplorerDriver();
		/* maximize browser window */
		driver.manage().window().maximize();
		/* implicit wait */
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* enter app url */
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		/* identify all the suggestions */
		List<WebElement> suggList = driver.findElement(By.xpath("//ul[@class='']"));
		/*get the suggetion count*/
		System.out.println("Suggestion Count: "+ suggList.size());
		/* get specific element from list i.e first element */
		System.out.println(suggList.get(0).getText());
		/* print all the suggestion name */
		for(int i=0;i<suggList.size();i++)
		{
			System.out.println(suggList.get(i).getText());
		}
		
	}

}
