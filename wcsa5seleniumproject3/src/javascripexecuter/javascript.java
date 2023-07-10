package javascripexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
	 {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//launch the browser
			
			WebDriver driver=new ChromeDriver();
			//maximaize the browser
		
			driver.manage().window().maximize();
			//apply emplicit wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//apply launch the web application 
			driver.get("file:///C:/Users/Shree/Desktop/wcsa5/disable.html");
			// identify webelement 
			driver.findElement(By.id("i11")).sendKeys("admin");
			Thread.sleep(2000);
			
			
			
		
			
			
			
			
			
			


	}

}
