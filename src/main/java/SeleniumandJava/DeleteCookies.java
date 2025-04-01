package SeleniumandJava;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DeleteCookies {
	
	public static void DeleteCookie(WebDriver driver) throws InterruptedException {
//		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("sessionKey");
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("excludeSwitches",
//		     Arrays.asList("disable-popup-blocking"));
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//div//div[@aria-label='Sign in to Google']")));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='WrcADd']")).click();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		DeleteCookie(driver);
	}

}
