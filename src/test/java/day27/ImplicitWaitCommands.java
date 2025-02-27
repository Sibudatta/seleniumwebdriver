package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitCommands {
	public static void main(String[] args) throws InterruptedException {



		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();


		//Thread.sleep(10000);   //Pause the execution
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
	}

}
