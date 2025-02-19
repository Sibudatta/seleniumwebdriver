package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book_flight {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		WebElement crossbutton= driver.findElement(By.xpath("commonModal__close"));
		crossbutton.click();
	
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement fromlocation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='originInput-input']")));
		fromlocation.click();
		fromlocation.clear();
		//fromlocation.sendKeys("btyu");
		
	}

}
