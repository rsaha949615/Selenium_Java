package RahulshettyAcamedy.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EcommerceImplictandExplict {
	
	public static void ecommerceimplicitandexplict(WebDriver driver,String[] names) {
		
		int j=0;
		List<WebElement> list=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<list.size();i++) {
			String name1=list.get(i).getText().split("-")[0].trim();
			List name2=Arrays.asList(names);
			if(name2.contains(name1)) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				j++;
				if(j==name1.length()) {
					break;
				}
			}
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] names= {"Brocolli","Cucumber","Tomato"};
		Thread.sleep(2000);
		ecommerceimplicitandexplict(driver,names);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		
		driver.findElement(By.xpath("(//div[@class='action-block']//button[@type='button'])[1]")).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.print(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}

}
