package SeleniumandJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceEndToEnd {
	
	public static void EndToEndTesting(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("anshik@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Iamking@000");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//input[@class='input txt text-validated'])[2]")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']/span[text()=' India']"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals("India")) {
				list.get(i).click();
			}
		}
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		EndToEndTesting(driver);

	}

}
