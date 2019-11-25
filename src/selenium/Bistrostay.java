package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bistrostay {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://products.ncryptedprojects.com/bistrostays_v4/");
	driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a")).click();
	driver.findElement(By.id("first_name")).sendKeys("sneha");
	driver.findElement(By.id("last_name")).sendKeys("gupta");
	driver.findElement(By.id("email")).sendKeys(" buyer.ncrypted@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");

	//Thread.sleep(4000);
	//driver.findElement(By.xpath("//div[@id='rc-anchor-container']")).click();
	Thread.sleep(20000);
	driver.findElement(By.id("signup_submit_btn")).click();
	
	}

}
