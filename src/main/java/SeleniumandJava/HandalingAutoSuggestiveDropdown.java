package SeleniumandJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingAutoSuggestiveDropdown {
	
	public static void HandalingAutoDropDown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals("India")) {
				list.get(i).click();
			}
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		HandalingAutoDropDown(driver);
		
	}
}
