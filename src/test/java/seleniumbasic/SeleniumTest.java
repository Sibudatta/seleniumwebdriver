package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1.launch chrome
 2.open url
 3.validate title
 4.close browser
 */

public class SeleniumTest {

	public static void main(String[] args) {
		//create chrome driver class object(chrome driver is having default constructor it will launch chrome  automatically)
		//launch chrome broswer
		//1.launch chrome app
		//ChromeDriver driver=new ChromeDriver();

		WebDriver driver=new ChromeDriver();

		//2.open URL
		driver.get("https://demo.opencart.com.gr/");

		//3.validate title
		String ac_title= driver.getTitle();
		if(ac_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		//4.close browser
		driver.close();  
	}

}
