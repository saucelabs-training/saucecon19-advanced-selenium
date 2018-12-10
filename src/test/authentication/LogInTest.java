package test.authentication;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.base.*;

public class LogInTest extends Base {

    @Test
    public void signInSuccessfully() {
        driver.get("https://www.saucedemo.com");

        String username = "standard_user";
        String password = "secret_sauce";

        WebDriverWait explicitWait = new WebDriverWait(driver, 10);

        WebElement usernameElement = explicitWait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-test='username']")));

        usernameElement.sendKeys(username);
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys(password);
        driver.findElement(By.className("login-button")).submit();

    }

}
