package RahulshettyAcamedy.java;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {
	
	public static void assigment(WebDriver driver,String[] name) throws InterruptedException {
		
		int j=0;
		List<WebElement> list=driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(2000);
		for(int i=0;i<list.size();i++) {
			String name1=list.get(i).getText().split("-")[0].trim();
			List name2=Arrays.asList(name);
			if(name2.contains(name1)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==name1.length()) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] name= {"Brocolli","Cucumber","Tomato"};
		Thread.sleep(2000);
		assigment(driver, name);

	}

}
