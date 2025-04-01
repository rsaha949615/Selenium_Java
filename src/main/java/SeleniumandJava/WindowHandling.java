package SeleniumandJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void HandalingWindow(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentId=it.next();
		String childId=it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childId);
		//WebElement email=driver.findElement(By.xpath("//p[@class='im-para red']"));
		String emailId=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		HandalingWindow(driver);
		

	}

}
