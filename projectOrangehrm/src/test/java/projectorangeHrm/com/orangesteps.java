package projectorangeHrm.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;

import com.app.cucu.Action.OrangehrmHomeAction;
import com.webutility.webutility;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangesteps {

	OrangehrmHomeAction orangehrmHomeAction = null;
	

	public orangesteps() {
		orangehrmHomeAction = new OrangehrmHomeAction();
	}

	@Given("^User is on Home Page \"([^\"]*)\"$")
	public void user_is_on_Home_Page(String Url) {
		webutility.getDriver().get(Url);
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {
		System.out.println("User Navigate to LogIn Page");
	}

	@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) {
		orangehrmHomeAction.Orangelogin(username, password);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		orangehrmHomeAction.orangclickevent();
		System.out.println("Login Successfully");
	}
	
	@But("^Message displayed Login UnSuccessfully$")
	public void message_displayed_Login_UnSuccessfully() {
		orangehrmHomeAction.orangclickevent();
		System.out.println("Login UnSuccessfully");
	}
	
	
	@Then("^scren shot of this page$")
	public void scren_shot_of_this_page(WebDriver driver, String destination) throws IOException {
			orangehrmHomeAction.Takescrenshot(driver, destination);
	}
	
	

	@Then("^Wait for some time$")
	public void wait_for_some_time() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Then("^User click on logout$")
	public void user_click_on_logout() throws FindFailed, InterruptedException {
		orangehrmHomeAction.Orangelogout();
		System.out.println("logout");

	}

@Then("^user is on home \"([^\"]*)\"$")
public void user_is_on_home(String arg1) {
	System.out.println( "somathings wrong");
}

}
