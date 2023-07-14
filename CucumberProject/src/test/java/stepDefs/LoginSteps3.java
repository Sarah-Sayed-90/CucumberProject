package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class LoginSteps3 {
    @Given("A user Navigates to Login URL")
    public void a_user_navigates_to_login_url() {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("A user login with {string} and {string}")
    //@When("A user login with {string} and {string}")
    public void userLogin(String username , String password) {
        loginPage.login(username,password);
    }

   /* @When("A user login with invalid username and invalid password")
    public void aUserLoginWithInvalidUsernameAndInvalidPassword() {
        loginPage.login("username2","password2");
    }*/

    @Then("A user is redirected to home page")
    public void aGreenSuccessfulMsgShouldBeDisplayed() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

       // Assert.assertEquals(loginPage.getSuccessLoginMsg(),"Your registration completed");
    }

    @Then("An error msg is displayed")
    public void anErrorMsgIsDisplayed() {

    }
}
