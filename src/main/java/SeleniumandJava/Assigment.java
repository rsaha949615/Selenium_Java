package SeleniumandJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void addIteams(WebDriver driver,String name,String password) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//*[@class='error-message-container error']")).getText();
		System.out.println(text);
		if(text.equals("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("It is wrong");
		}else {
			System.out.println("it is oky");
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String name="error_user";
		String password="secret_sauc";
		addIteams(driver,name,password);
		
	}

}
