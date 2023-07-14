package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pagesNop.LoginPage;

import java.time.Duration;

public class LoginSteps {
    WebDriver driver;
    LoginPage login;

   // @Given("A user open Chrome Browser")
    //public void a_user_open_chrome_browser() {

   // }

   /* @Given("A user Navigates to Login URL")
    public void a_user_navigates_to_login_url() {

        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }


    @When("A user inserts a valid username and valid password")
    public void a_user_inserts_a_valid_username_and_valid_password() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@test111.com","123456");
    }
    @Then("A user should redirected to the homepage")
    public void a_user_should_redirected_to_the_homepage() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.getSuccessLoginMsg(),"Your registration completed");
    }

    @When("A user inserts an invalid username and invalid password")
    public void aUserInsertsAnInvalidUsernameAndInvalidPassword() {

    }

    @Then("An error msg is displayed")
    public void anErrorMsgIsDisplayed() {
    }*/


}
