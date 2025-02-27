package day28;

import java.net.http.WebSocket;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v130.browser.model.WindowID;

public class WindowsHandleConcept {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String>	windowids=driver.getWindowHandles();

		//Approach--covert set string to list collection(if we have set collection we can not find  indivisual item)
		//we dont have get () in set collection

		/*List<String>  windowlist=new ArrayList(windowids);
		String  parentid=windowlist.get(0);
		String childid= windowlist.get(1);
		//switch to child window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());

		//switch to parent
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());*/

		//Approach2

		for (String winid : windowids)
		{

			String Title=driver.switchTo().window(winid).getTitle();


			if(Title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}


		}
	}

}
