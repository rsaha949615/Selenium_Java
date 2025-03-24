package SeleniumandJava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {
	public static void LinksCount(WebDriver driver) throws InterruptedException {
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerderiver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerderiver.findElements(By.tagName("a")).size());
		
		WebElement coloumDriver=driver.findElement(By.xpath("//table//tr//td[1]//ul"));
		System.out.println(coloumDriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<coloumDriver.findElements(By.tagName("a")).size();i++) {
			String clickablelinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickablelinkTab);
			Thread.sleep(2000);
		}
		Set<String>window= driver.getWindowHandles();
		java.util.Iterator<String> it=window.iterator();
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
