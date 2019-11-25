package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bistro_Assert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/bistrostays_v4/");
		String ev=("https://Products.ncryptedprojects.com/bistrostays_v4/user/profile/161/Buyer");
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys(" buyer.ncrypted@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("submit_btn")).click();
		String av=driver.getCurrentUrl();
		System.out.println(av);
		if(ev.equals(av)==true) {
			System.out.println("Buyers login");
		}
		
		else {
			System.out.println(" Not Buyers login");
		
		}

	}

}
