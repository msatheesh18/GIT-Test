package GITTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G1_GITTest {

	
	public void logintest(){
		
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
		
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.sendKeys(Keys.ENTER);
	}
}
