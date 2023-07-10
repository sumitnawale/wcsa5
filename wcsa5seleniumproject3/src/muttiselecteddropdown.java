import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class muttiselecteddropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/wcsa5/multipalmenu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Shree/Desktop/wcsa5/multipalmenu.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiselectDD);
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("v4");
		Thread.sleep(2000);
		
		// to select mutipal options
		for(int i=0;i<4;i++);
		

		
		
		
		
		
		

	}

}
