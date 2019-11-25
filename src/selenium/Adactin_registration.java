package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_registration {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
       driver.get("https://adactin.com/HotelApp/Register.php");
       driver.findElement(By.id("username")).sendKeys("nagsneha");
       driver.findElement(By.id("password")).sendKeys("1234567");
       driver.findElement(By.id("re_password")).sendKeys("1234567");
       driver.findElement(By.id("full_name")).sendKeys("sneha nag");
       driver.findElement(By.id("email_add")).sendKeys("sneha.nag57@gmail.com");
       Thread.sleep(15000);
       
       driver.findElement(By.id("captcha-form")).sendKeys("");;
       driver.findElement(By.id("tnc_box")).click();
       driver.findElement(By.id("Submit")).click();
      


       
       
       
       
	}

}
