package gcr_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GCRBase {
	
	public WebDriver driver;
	
	public static void main(String[] args) {
		GCRBase obj = new GCRBase();
	}
	public GCRBase() {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		String text = driver.findElement(By.xpath("//td[contains(text(),'Logged in as: admin')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
	}

}
