package master;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialization {
	
	public Properties pro=null;
	public WebDriver driver = null;
	public File file;
	
	
	public void init() throws Exception
	{
		pro = new Properties();
		file = new File("src\\test\\resources\\data.properties");
		FileInputStream filein  = new FileInputStream(file);
		pro.load(filein);
	}

	public void browser()
	{
		String browser = pro.getProperty("Browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup(); 
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			
		}
	}

	
}
