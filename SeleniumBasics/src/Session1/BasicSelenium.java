package Session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openChrome();
		//openIE();
		//openFF();
	}
	public static void openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softwares\\Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		String baseURL = "https://www.google.com/";
		wd.get(baseURL);
		String title=wd.getTitle();
		System.out.println(title);
		//wd.close();
	}
	
	/*public static void openIE()
	{
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Selenium Workspace\\SeleniumBasics\\DriverExecutable\\IEDriverServer.exe");
		//WebDriver wd1=new InternetExplorerDriver();
		WebDriver IEDriver=new InternetExplorerDriver();
	}*/
	
	/*public static void openFF()
	{
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\Selenium Workspace\\SeleniumBasics\\DriverExecutable\\geckodriver.exe");
		WebDriver wd2=new FirefoxDriver();
		String baseURL="https://www.guru99.com/";
		wd2.get(baseURL);
		wd2.getTitle();
		String title=wd2.getTitle();
		System.out.println(title);
	}*/
		
}
