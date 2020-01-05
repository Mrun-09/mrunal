package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException
	{
		String internetExplorerDriverExecutableLocation = System.getProperty("user.dir")
				+"\\DriverExecutable\\IEDriverServer.exe";
	
		System.setProperty("webdriver.ie.driver", internetExplorerDriverExecutableLocation);
		
		WebDriver driver=new InternetExplorerDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
	}

}
