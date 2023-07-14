package pagesNop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait expWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait;
    }

    public Actions actions(){
/*        Actions actions = new Actions(driver);
        return actions;
        */
        return new Actions(driver);
    }

    public void insertText(By locator, String text){
        WebElement webElement = driver.findElement(locator);

        expWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void click1(By locator){
        WebElement webElement = driver.findElement(locator);
        expWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }
}
