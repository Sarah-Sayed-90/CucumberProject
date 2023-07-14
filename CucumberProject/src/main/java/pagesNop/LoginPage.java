package pagesNop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By successMsg = By.cssSelector(".page-body .result");
    private By unsuccessMsg = By.cssSelector(".message-error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password){
        insertText(emailField,email);
        insertText(passwordField,password + Keys.ENTER);
    }

    public String getSuccessLoginMsg(){
        return driver.findElement(successMsg).getText();
    }

    public String getUnsuccessLoginMsg(){
        return driver.findElement(unsuccessMsg).getText();
    }
}
