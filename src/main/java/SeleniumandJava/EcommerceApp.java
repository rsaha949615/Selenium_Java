package SeleniumandJava;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {
	public static void EcommerceAppCheck(WebDriver driver,String[] name) {
		int j=0;
		List<WebElement> list=driver.findElements(By.xpath("//h4[@class='product-name']"));
		System.out.println(driver.findElement(By.xpath("//h4[@class='product-name']")).getText());
		for(int i=0;i<list.size();i++) {
			String[] word=list.get(i).getText().split("-");
			String itemsAdd=word[0].trim();
			List formattedList=Arrays.asList(name);
			if(formattedList.contains(itemsAdd)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==name.length) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String[] names= {"Brocolli","Cucumber","Tomato"};
		EcommerceAppCheck(driver, names);

	}

}
