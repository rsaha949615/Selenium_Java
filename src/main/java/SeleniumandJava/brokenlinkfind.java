package SeleniumandJava;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinkfind {
	
	public static void findbrokenlink(WebDriver driver) throws MalformedURLException, IOException {
		String url=driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
		
		HttpsURLConnection conn=(HttpsURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode=conn.getResponseCode();
		System.out.print(respCode);
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		findbrokenlink(driver);
		
	}

}
