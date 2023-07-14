package pagesNop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {
    //1- Locators

    //Gender Locators
    private By genderMale = By.id("gender-male");
    private By genderFemale = By.id("gender-female");

    //Date Locators
    private By dayElement = By.name("DateOfBirthDay");
    private By monthElement = By.name("DateOfBirthMonth");
    private By yearElement = By.name("DateOfBirthYear");

    private By emailField = By.id("Email");

    //2- Variables

    //3- Constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //4- Actions
    public RegisterPage selectDay(String day){
        Select selectday = new Select(driver.findElement(dayElement));
        selectday.selectByValue(day);
        return new RegisterPage(driver);
    }

    public RegisterPage selectMonth(int month){
        Select selectmonth = new Select(driver.findElement(monthElement));
        selectmonth.selectByIndex(month);
        return new RegisterPage(driver);
    }

    public RegisterPage selectYear(String year){
        Select selectyear = new Select(driver.findElement(yearElement));
        selectyear.selectByValue(year);
        return new RegisterPage(driver);
    }

    public RegisterPage selectDate(String day, int month, String year){
        Select selectday = new Select(driver.findElement(dayElement));
        selectday.selectByValue(day);

        Select selectmonth = new Select(driver.findElement(monthElement));
        selectmonth.selectByIndex(month);

        Select selectyear = new Select(driver.findElement(yearElement));
        selectyear.selectByValue(year);
        return new RegisterPage(driver);
    }

    public void chooseGender(String gender){

        if (gender.toLowerCase() == "male"){
            driver.findElement(genderMale).click();
        }
        else if (gender.toLowerCase() =="female"){
            driver.findElement(genderFemale).click();
        }
        else {
            System.out.println("Invlaid Gender");
        }
    }

    public void insertEmail(String email){
        insertText(emailField,email);
    }


}
