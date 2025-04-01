package RahulshettyAcamedy.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {
	
	public static void ScrollingCheck(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	public static void DropDownCheck(WebDriver driver) {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		////div[@class='tableFixHead']//table//tbody//tr//td[4]
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement scrolldown=driver.findElement(By.xpath("//div[@class='tableFixHead']"));
	    js.executeScript("arguments[0].scrollTop=5000;", scrolldown);
	    
	    int sum=0;
	    int total=0;
	    List<WebElement> list=driver.findElements(By.xpath("//div[@class='tableFixHead']//table//tbody//tr//td[4]"));
	    for(int i=0;i<list.size();i++) {
	    	total=Integer.parseInt(list.get(i).getText());
	    	sum=sum+total;
	    }
	    System.out.println(sum);
	    int total1=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
	    if(sum==total1) {
	    	System.out.print("It is oky");
	    }else {
	    	System.out.print("It is not oky");
	    }
	    
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		ScrollingCheck(driver);
		DropDownCheck(driver);
	}

}
