package SeleniumandJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingDropDown {
	
	public static void DropDownScrolling(WebDriver driver) throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	public static void DropDownScrollings(WebDriver driver) throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement scrolldown=driver.findElement(By.xpath("//div[@class='tableFixHead']"));
	    js.executeScript("arguments[0].scrollTop=5000;", scrolldown);
	
	    int sum=0;
	List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	for(int i=0;i<values.size();i++) {
		sum=sum+Integer.parseInt(values.get(i).getText());
	}
	System.out.println(sum);
	
	int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
	if(sum==total) {
		System.out.print("This is equal");
	}else {
		System.out.print("This is not equal");
	}
	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		DropDownScrolling(driver);
		DropDownScrollings(driver);
		
	}

}
