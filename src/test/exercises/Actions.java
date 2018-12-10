package test.exercises;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.base.Base;

public class Actions extends Base {

    //
    // Exercise:
    // Use Selenium to submit the sign up form
    //

    @Test
    public void signUpExistingAccount() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // navigate to desired page
        driver.get("https://www.saucedemo.com");

        // Specify Data

        String username = "standard_user";
        String password = "secret_sauce";
        String userField = "[data-test='username']";
        String passField = "[data-test='password']";
        String loginBtn = "[value='LOGIN']";

        // wait for username field

        // send username keystrokes

        // send password keystrokes

        // click login button to submit keystrokes

        // wait for expected URL to appear
        wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/inventory.html"));
    }

}