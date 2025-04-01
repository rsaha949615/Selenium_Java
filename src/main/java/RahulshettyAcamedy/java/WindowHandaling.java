package RahulshettyAcamedy.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandaling {

	public static void handleWindow(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		String name=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split("with")[0];
		System.out.print(name);
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mentor@rahulshettyacademy.com");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		handleWindow(driver);
		
	}

}
