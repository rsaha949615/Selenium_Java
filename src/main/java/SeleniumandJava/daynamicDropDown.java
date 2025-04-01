package SeleniumandJava;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class daynamicDropDown {
	
	public static void daynamicDropdown(WebDriver driver) throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//div[@class='paxinfo']"));
		ele.click();
		System.out.println(ele.getText());
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(ele.getText());
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		daynamicDropdown(driver);
	}

}
