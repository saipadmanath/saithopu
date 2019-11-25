package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp");
		String ev = ("https://Adactin.com/HotelApp/SearchHotel.php");
		driver.findElement(By.id("username")).sendKeys("snehanag");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.id("login")).click();
		String av=driver.getCurrentUrl();
		//System.out.println(av);
		//if(ev.equals(av)==true)
		if(ev.equalsIgnoreCase(av)==true){
			System.out.println("sucessfully logedin");
		}
		else {
			System.out.println("unsucessfully logedin");
		}
	}

}
