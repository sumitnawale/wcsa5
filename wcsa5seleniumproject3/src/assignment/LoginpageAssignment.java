package assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageAssignment {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.switchTo().activeElement().sendKeys("monica geller ",Keys.ENTER);
	driver.findElement(By.className("lNPCp")).click();
	
		
	}
	

}
