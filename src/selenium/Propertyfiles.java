package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyfiles {

	public static void main(String[] args) throws IOException {
		
	
		FileInputStream f= new FileInputStream("E:\\adictin.txt");
		Properties p=new Properties();
		p.load(f);
		System.setProperty("webdriver.chrome.driver", "E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp");
		driver.findElement(By.id("username")).sendKeys(p.getProperty("usn"));
		driver.findElement(By.id("password")).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.id("login")).click();
	}

}