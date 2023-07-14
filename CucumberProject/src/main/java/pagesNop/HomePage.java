package pagesNop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase  {
    //1- Locators
    private By computerHeader = By.cssSelector("[class=\"top-menu notmobile\"] [href=\"/computers\"]");
    private By desktopsSubHeader = By.cssSelector("[class=\"top-menu notmobile\"] [href=\"/desktops\"]");
    //2- Variables


    //3- Constructor
   // public HomePage(WebDriver driver) {super(driver);
    }

    //4- Actions
    public void clickDesktops(){
        actions().moveToElement(driver.findElement(computerHeader));
        click1(desktopsSubHeader);
    }


    //Find Elements

    public void testmethod(){}


}
