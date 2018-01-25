package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDataTableWithList {

	public WebDriver driver;
	public String expected = "Logged in as: admin (Logoff)";

	@Given("^GCR Site is launched successfully\\.$")
	public void gcr_Site_is_launched_successfully() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gcrit.com/build3/admin/");

	}

	@When("^User entered username and password$")
	public void user_entered_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		String username = data.get(0).get(0);
		String password = data.get(0).get(1);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@When("^User clicked Login button$")
	public void user_clicked_Login_button() throws Throwable {
		driver.findElement(By.id("tdb1")).click();
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() {
		String Actual = driver.findElement(By.xpath("//td[contains(text(),'Logged in as: admin')]")).getText();
		System.out.println(Actual);
		if (expected.equals(Actual)) {
			System.out.println("Test case passed--" + "--Expected Result--" + expected + "--Actual Result--" + Actual);
		}
	}

	@Then("^User loggOff for the site$")
	public void user_loggOff_for_the_site() {
		driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();

	}
}
