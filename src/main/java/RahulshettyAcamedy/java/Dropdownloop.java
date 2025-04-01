package RahulshettyAcamedy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownloop {
	
	public static void DropDown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		driver.findElement(By.xpath("(//input[@class='buttonN'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText());
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		DropDown(driver);
	}

}
