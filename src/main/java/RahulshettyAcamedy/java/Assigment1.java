package RahulshettyAcamedy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1 {
	
	public static void assigment(WebDriver driver,String username,String password) {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("error_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauc");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
		System.out.println(text);
		
		String text1="Epic sadface: Username and password do not match any user in this service";
		if(text.equals(text1)) {
			System.out.println("both are same");
		}else {
			System.out.println("both not smae");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String username="error_user";
		String password="secret_sauce";
		assigment(driver,username,password);
		

	}

}
