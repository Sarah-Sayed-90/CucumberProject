package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesNop.LoginPage;

import java.time.Duration;

public class Hooks {


    public static WebDriver driver;
    public static LoginPage loginPage;

    @Before(value = "@regression", order = 0)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage = new LoginPage(driver);
    }

    @Before(order = 1)
    public void setUp2() {
        System.out.println("after Scenario 1");
    }

    @After(order = 1)
    public void tearDown() {
        driver.quit();
        System.out.println("after Scenario 1");
    }

    @After(order = 0)
    public void tearDown2() {
        driver.quit();
        System.out.println("after Scenario 2");
    }

}

