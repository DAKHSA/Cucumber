package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataDrivenWithExample {
	
	public WebDriver driver;
	public String expected = "Logged in as: admin (Logoff)";
	
	@Given("^User is already launched application$")
	public void user_is_already_launched_application() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gcrit.com/build3/admin/");

	}

	@Then("^Enter \"(.*)\" and \"(.*)\"$")
	public void Enter_username_and_password(String username,String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() {
		driver.findElement(By.id("tdb1")).click();
	    	}

	@Then("^Verify Home page is displayed as expected$")
	public void Verify_Home_page_is_displayed_as_expected() {
		String Actual = driver.findElement(By.xpath("//td[contains(text(),'Logged in as: admin')]")).getText();
		System.out.println(Actual);
		if (expected.equals(Actual)) {
			System.out.println("Test case passed--" + "--Expected Result--" + expected + "--Actual Result--" + Actual);
		}
	}
	
	@Then("^Click on LogOut link$")
	public void click_on_LogOut_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
	    
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
		driver.quit();
	   
	}

}
