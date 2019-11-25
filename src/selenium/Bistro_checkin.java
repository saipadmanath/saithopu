package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bistro_checkin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/bistrostays_v4/");
		driver.findElement(By.id("location")).sendKeys("paris");
		
		
		
	}

}
