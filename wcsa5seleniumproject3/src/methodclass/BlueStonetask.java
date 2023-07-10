package methodclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStonetask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch thr browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		
	
		driver.manage().window().maximize();
		//apply implicitwait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("https://www.bluestone.com/oldgoldexchange.html");
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement faremeElement = driver.findElement(By.xpath("/iframe[@id='fc_widget']"));
	
		 driver.switchTo().frame("fc_widget");
	
		driver.findElement(By.id("chat-icon")).click();


		
		
			 }
	

		 
		 


	}                                              

}
