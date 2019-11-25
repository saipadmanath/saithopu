package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_login {

	public static void main(String[] args) throws Exception
	{
		// open browser
		System.setProperty("webdriver.chrome.driver","E:\\snehaN\\selenium prog\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.id("username")).sendKeys("snehanag");
		
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("1234567");
		
		driver.findElement(By.id("login")).click();
		//new Select (driver.findElement(By.id("location"))).selectByIndex(3);
		
		new Select (driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		new Select (driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Hervey");
		new Select (driver.findElement(By.id("room_type"))).selectByVisibleText("Super Deluxe");
		new Select (driver.findElement(By.id("room_nos"))).selectByVisibleText("5 - Five");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("16/11/2019");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("20/11/2019");
		new Select (driver.findElement(By.id("adult_room"))).selectByVisibleText("2 - Two");
		new Select (driver.findElement(By.id("child_room"))).selectByVisibleText("1 - One");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("first_name")).sendKeys("Sneha");
	    driver.findElement(By.id("last_name")).sendKeys("Nag");
	    driver.findElement(By.id("address")).sendKeys("401 A Hyderabad");
	    driver.findElement(By.id("cc_num")).sendKeys("2365489526445789");
	    new Select (driver.findElement(By.id("cc_type"))).selectByVisibleText("American Express");
	    new Select (driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("May");
	    new Select (driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2021");
	    driver.findElement(By.id("cc_cvv")).sendKeys("564");
	    driver.findElement(By.id("book_now")).click();
	    //change password
	    driver.findElement(By.linkText("Change Password")).click();
	    driver.findElement(By.id("current_pass")).sendKeys("123456");
	    driver.findElement(By.id("new_password")).sendKeys("1234567");
	    driver.findElement(By.id("re_password")).sendKeys("1234567");
	    driver.findElement(By.id("Submit")).click();
	    
	   // Thread.sleep(8000);
	    
//	   driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
//	    driver.findElement(By.id("order_id_text")).sendKeys("661WZI426L");
//	    driver.findElement(By.id("search_hotel_id")).click();
//	    driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")).click();
//	    driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[3]/td/input[1]")).click();
//	 
//	    Alert a=driver.switchTo().alert();
//	     a.accept();
	     
//	    driver.findElement(By.id("logout")).click();
//	    driver.findElement(By.linkText("Click here to login again")).click();
//	    driver.findElement(By.linkText("Forgot Password?")).click();
}
}