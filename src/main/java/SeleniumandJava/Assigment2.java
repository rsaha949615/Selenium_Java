package SeleniumandJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("error_user");
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("secret_sauc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		System.out.print(driver.findElement(By.xpath("//*[@class='error-message-container error']")).getText());

	}

}
