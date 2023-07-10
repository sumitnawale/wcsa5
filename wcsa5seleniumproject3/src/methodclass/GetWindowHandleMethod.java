package methodclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	private static final String ChildHandle = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch thr browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		
	
		driver.manage().window().maximize();
		//apply implicitwait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("http://omayo.blogspot.com/");
		//get handle or address of cureent or parent window ..
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println( "address of parent window :" +parentHandle);
		Thread.sleep(2000);
		Set<String> childHandle = driver .getWindowHandles();
		System.out.println("address of child window :"+ChildHandle);
	
		
		//read addresses by using lopping statement 
		 for(String wh:childHandle) {
			 System.out.println();
			 
		}
	}
}


