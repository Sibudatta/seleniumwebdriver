package day29;

import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {
	public static void main(String[] args) throws InterruptedException {



		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		//slect specific check box

		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		List<WebElement>  checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//1//select all check box

		/*for (WebElement eachcheckbox : checkbox) {

		eachcheckbox.click();
	}*/

		//2//select last 3 checkbox from the list(formula: total no check boxes - how many check box want to select)
		//ex: 7-3=4

		/*for(int i=4;i<checkbox.size();i++) {
		checkbox.get(i).click();
	}*/

		//3.select first 3 check box

		/*for(int i=0; i<3;i++) {

		checkbox.get(i).click();
	}*/

		//4.unselect checkboxes if they are selected
		
		for(int i=0; i<3;i++) {

			checkbox.get(i).click();
			
		}
		
		Thread.sleep(5000);
		
		for(int i=0; i<checkbox.size();i++) {

			
			if(checkbox.get(i).isSelected()) {
				
			
			checkbox.get(i).click();
			
		}
		



	}

}}
