package SeleniumandJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUI {
	
	public static void UIDropDown(WebDriver driver) {
		driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'])[1]")).click();
		driver.findElement(By.xpath("//a[text()=' Bagdogra (IXB)']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Chennai (MAA)']")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		UIDropDown(driver);
		
	}

}
