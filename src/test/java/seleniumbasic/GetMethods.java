package seleniumbasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v130.browser.model.WindowID;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//return title of webpage
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());//url of page
		//System.out.println(driver.getPageSource());//return source code

		//String windowid=driver.getWindowHandle();
		//System.out.println("window id :" + windowid);
		
		//driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 Set<String>  windowids=driver.getWindowHandles();
		 System.out.println(windowids);
		
		

	}

}
