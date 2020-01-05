package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Selenium Workspace\\SeleniumBasics\\DriverExecutable\\chromedriver.exe");
		WebDriver chromeDriver=new ChromeDriver();
		
		String basrURL="http://demowebshop.tricentis.com";
		chromeDriver.get(basrURL);
		
		chromeDriver.findElement(By.xpath("//a[@class='ico-register']")).click();
		chromeDriver.findElement(By.xpath("//input[@id='gender-female']")).click();
		chromeDriver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("Mrunal");
		chromeDriver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Thakare");
		chromeDriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mrunal.o.thakare@gmail.com");
		chromeDriver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345");
		chromeDriver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("12345");
		String title=chromeDriver.getTitle();
		System.out.println(title);
		
		String currentURL=chromeDriver.getTitle();
		System.out.println(currentURL);
		// chromeDriver.close();
	}

}
