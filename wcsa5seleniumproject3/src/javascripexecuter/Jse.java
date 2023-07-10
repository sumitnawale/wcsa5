package javascripexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse extends javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashbords.handmadeinteractive.com/jasonlove/");
		
       JavascriptExecutor jse = (JavascriptExecutor) driver ;
       
       jse.executeScript("window.scrollBy(0,5000)");     
      
	}

}
