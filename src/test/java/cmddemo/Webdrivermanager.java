package cmddemo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import master.Initialization;

public class Webdrivermanager extends Initialization {


	
	public static void main(String[] args) throws Exception {
		Initialization in = new Initialization();
		in.init();
		in.browser();
		in.driver.manage().window().maximize();
		in.driver.manage().window().fullscreen();
		in.driver.get(in.pro.getProperty("url"));
		in.driver.findElement(By.id("UserName")).sendKeys("hms@gmail.com");
		in.driver.findElement(By.id("Password")).sendKeys("Admin$123");
		in.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
}
	

}
