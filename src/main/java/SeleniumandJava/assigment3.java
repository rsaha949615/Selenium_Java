package SeleniumandJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment3 {
	
	public static void addIteams(WebDriver driver,String name,String password) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='bm-item menu-item'])[3]")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String name="error_user";
		String password="secret_sauce";
		addIteams(driver,name,password);
	}

}
