package RahulshettyAcamedy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist {
	
	public static void dropDown(WebDriver driver) throws InterruptedException {
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		select.selectByIndex(1);
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		select.selectByVisibleText("AED");
		Thread.sleep(2000);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("USD");
		Thread.sleep(2000);
		System.out.println(select.getFirstSelectedOption().getText());
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		dropDown(driver);
		
	}

}
