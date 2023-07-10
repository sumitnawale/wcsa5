package methodclass;

import java.time.Duration;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonetask1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch thr browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		
	
		driver.manage().window().maximize();
		//apply implicitwait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple airpods");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		 String parent = driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		  
//		 for( String wh:  child)
//		 {
//	
//		 }
	

		 
		 

	}

}
