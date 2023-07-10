package exampl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("haribhau");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("rambhau");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		Thread.sleep(2000);
		
	}
}2