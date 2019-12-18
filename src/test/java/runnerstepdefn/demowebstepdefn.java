package runnerstepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demowebstepdefn {
	WebDriver driver;
	
	@Given("demoweb website is launchedxx")
	public void demoweb_website_is_launchedxx() {
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user clicks on sign up xx")
	public void user_clicks_on_sign_up_xx() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters proper data required for the registeration xx")
	public void user_enters_proper_data_required_for_the_registeration_xx() {
		System.out.println("skipped reg");
		//driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on submit button to create his account xx")
	public void clicks_on_submit_button_to_create_his_account_xx() {
		System.out.println("skipped reg1");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("demoweb is launched xx")
	public void demoweb_is_launched_xx() {
		System.out.println("skipped reg2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he provides registered valid username xx {string}")
	public void he_provides_registered_valid_username_xx(String ustring) {
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(ustring);;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he provides valid password in the field xx {string}")
	public void he_provides_valid_password_in_the_field_xx(String pstring) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pstring);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he verifies the login xx")
	public void he_verifies_the_login_xx() {
		driver.findElement(By.xpath("/input[@class='button-1 login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
