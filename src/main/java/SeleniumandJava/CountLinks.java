package SeleniumandJava;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {
	public static void LinksCount(WebDriver driver) throws InterruptedException {
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement fourfooterdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']//tbody//tr//td[1]//ul"));
		System.out.println(fourfooterdriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<fourfooterdriver.findElements(By.tagName("a")).size();i++) {
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			fourfooterdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(2000);
		}
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		LinksCount(driver);
	}

}
