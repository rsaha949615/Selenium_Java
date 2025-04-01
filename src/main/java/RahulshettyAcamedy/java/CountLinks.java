package RahulshettyAcamedy.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void linksCount(WebDriver driver) {
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		WebElement onlyfourfooter=driver.findElement(By.xpath("//table[@class='gf-t']//tbody//tr//td[1]//ul"));
		System.out.println(onlyfourfooter.findElements(By.tagName("a")).size());
		
		for(int i=0;i<onlyfourfooter.findElements(By.tagName("a")).size();i++) {
			String clickablelinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			onlyfourfooter.findElements(By.tagName("a")).get(i).sendKeys(clickablelinkTab);
		}
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		linksCount(driver);
	}

}
