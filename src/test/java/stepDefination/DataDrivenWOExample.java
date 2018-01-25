package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataDrivenWOExample {

	public WebDriver driver;
	public String expected = "Logged in as: admin (Logoff)";

	@Given("^GCR Site is already launched$")
	public void GCR_Site_is_already_launched() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gcrit.com/build3/admin/");

	}

	@Then("^User enter \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^User clicked on Login button$")
	public void User_clicked_on_Login_button() {
		driver.findElement(By.id("tdb1")).click();
	}

	@Then("^Verify whether is landed in Home page as expected$")
	public void Verify_whether_is_landed_in_Home_page_as_expected() {
		String Actual = driver.findElement(By.xpath("//td[contains(text(),'Logged in as: admin')]")).getText();
		System.out.println(Actual);
		if (expected.equals(Actual)) {
			System.out.println("Test case passed--" + "--Expected Result--" + expected + "--Actual Result--" + Actual);
		}
		//Assert.assertTrue(expected.equalsIgnoreCase(Actual));
	}

	@Then("^user clicked on LogOut link$")
	public void user_clicked_on_LogOut_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
	}

	@Then("^user closed the browser$")
	public void user_closed_the_browser() {
		driver.quit();
	}

}
