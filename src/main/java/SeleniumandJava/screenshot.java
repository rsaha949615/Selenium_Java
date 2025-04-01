package SeleniumandJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void TakeScreenShot(WebDriver driver) {
		
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		TakeScreenShot(driver);

	}

}
