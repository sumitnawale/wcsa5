package exampl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilicitWait {

	private static Object expliciwait;

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.id("//IMG[@alt='Men']")).click();
		
		driver.findElement(By.linkText("//IMG[@alt='Men Dhoti']")).click();
		driver.findElement(By.xpath("//IMG[@alt='Check Delivery']")).sendKeys("411033");
       // expliciwait.unit(Expectedcondiations.elementToBeClickable(By.xpath("//button[@id='chck']"))).Click();
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
