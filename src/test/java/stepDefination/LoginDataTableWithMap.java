package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDataTableWithMap {

	public WebDriver driver;
	public String expected = "Logged in as: admin (Logoff)";

	@Given("^Application GCR Site is launched successfully.$")
	public void Application_GCR_Site_is_launched_successfully() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gcrit.com/build3/admin/");

	}

	@When("^Entering username and password$")
	public void Entering_username_and_password(DataTable credentials) {
		for (Map<String, String> datas : credentials.asMaps(String.class,String.class)) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(datas.get("username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(datas.get("password"));
		}
	}

	 @When("^Clicking Login button$")
	public void Clicking_Login_button(){
		driver.findElement(By.id("tdb1")).click();
	}

	@Then("^Check Home page is displayed$")
	public void Check_Home_page_is_displayed() {
		String Actual = driver.findElement(By.xpath("//td[contains(text(),'Logged in as: admin')]")).getText();
		System.out.println(Actual);
		if (expected.equals(Actual)) {
			System.out.println("Test case passed--" + "--Expected Result--" + expected + "--Actual Result--" + Actual);
		}
	}

	@Then("^GCR site is loggedOff$")
	public void loggOff_from_the_site() {
		driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
	}

	@Then("^browser should be closed$")
	public void browser_should_be_closed() {
		driver.quit();

	}
}
