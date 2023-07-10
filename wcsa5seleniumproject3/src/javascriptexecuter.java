import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		
		WebDriver driver=new ChromeDriver();
		//maximaize the browser
	
		driver.manage().window().maximize();
		//apply emplicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//apply launch the web application 
		driver.get()
		// To perform scrolling operations
		javascriptExecuter jse=()

	}

}
