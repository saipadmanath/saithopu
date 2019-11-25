package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/SearchHotel.php");
driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.id("username")).sendKeys("snehanag");
		
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.id("login")).click();
		
		
		
		new Select (driver.findElement(By.id("location"))).selectByIndex(5);
		
		
		

	}

}
