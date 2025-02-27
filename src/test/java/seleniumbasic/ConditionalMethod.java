package seleniumbasic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();

		//isdisplayed 

		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("display logo : " + logo.isDisplayed());

		//Boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();

		// System.out.println("display logo : " + status);


		//isenabled-basically used for input box should enabled state-perform any action

		boolean  status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("input box enable : " + status);


		WebElement male_radiobutton= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement  female_radio_button=driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println(male_radiobutton.isSelected());
		System.out.println(female_radio_button.isSelected());

		System.out.println("after selected male ");
		male_radiobutton.click();
		System.out.println("is male selected  :"   + male_radiobutton.isSelected());
		System.out.println("is female selected  :" +   female_radio_button.isSelected());
	}

}
