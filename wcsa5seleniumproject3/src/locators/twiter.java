package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Example.chromedriver;

public class twiter {

	public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.orangehrm.com/");




