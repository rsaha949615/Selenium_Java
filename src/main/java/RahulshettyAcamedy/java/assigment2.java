package RahulshettyAcamedy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment2 {
	
	public static void Assigment2(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("error_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
//		Thread.sleep(2000);
//		String text=driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
//		
//		String text1="Epic sadface: Username and password do not match any user in this service";
//		if(text.equals(text1)) {
//			System.out.println("both are same");
//		}else {
//			System.out.println("both are not smae");
//		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='bm-item menu-item'])[3]")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Assigment2(driver);
	}

}
