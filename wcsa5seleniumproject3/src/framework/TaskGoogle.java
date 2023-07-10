package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch thr browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		
	
		driver.manage().window().maximize();
		//apply implicitwait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	
		
	}

}
