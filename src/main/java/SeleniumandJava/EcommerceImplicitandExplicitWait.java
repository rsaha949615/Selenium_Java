package SeleniumandJava;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceImplicitandExplicitWait {
	
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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
			
			driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//*[@class='promoBtn']")).click();
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
			System.out.print(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

		}

}
