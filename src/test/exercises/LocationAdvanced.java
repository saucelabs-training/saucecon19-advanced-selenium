package test.exercises;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.base.Base;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

//
// Exercise:
// Fill in the Strings to Define the Specified Locators to get the tests to pass
//


public class LocationAdvanced extends Base {

    @Before
    public void navigate() {
        driver.get("https://www.saucedemo.com");
    }


    @Test
    public void locateUserField() {

        // Define Locators

        //String cssId = "#session_email";
        String cssClassName = "";
        String cssAttribute = "";
        String cssMultAttribute = "";
        String cssDescendant = "";
        String cssChild = "";



        // IGNORE THE DETAILS OF THE ASSERTIONS BELOW
        // ALL YOU NEED TO KNOW IS THAT IF YOU RUN THIS TEST
        // WITH THE RIGHT VALUES ABOVE IT WILL PASS

        WebElement userField = driver.findElements(By.xpath("//*")).get(9);
        //assertEquals(emailField, driver.findElement(By.cssSelector(cssId)));
        assertEquals(userField, driver.findElement(By.cssSelector(cssClassName)));
        assertEquals(userField, driver.findElement(By.cssSelector(cssAttribute)));
        assertEquals(userField, driver.findElement(By.cssSelector(cssMultAttribute)));
        assertEquals(userField, driver.findElement(By.cssSelector(cssDescendant)));
        assertEquals(userField, driver.findElement(By.cssSelector(cssChild)));

        //assertTrue(cssId.contains("#"));
        assertTrue(cssClassName.contains("."));
        assertTrue(cssAttribute.contains("="));
        assertTrue(cssMultAttribute.contains("]["));
        assertTrue(cssDescendant.contains(" "));
        assertTrue(cssChild.contains(" > "));
    }

    @Test
    public void locatePasswordField() {

        // Define Locators

        String cssDescendant = "";
        String css2ndChild = "";
        String cssSecondChildFromEnd = "";

        // IGNORE THE DETAILS OF THE ASSERTIONS BELOW
        // ALL YOU NEED TO KNOW IS THAT IF YOU RUN THIS TEST
        // WITH THE RIGHT VALUES ABOVE IT WILL PASS

        WebElement passField = driver.findElement(By.cssSelector(""));

        assertEquals(passField, driver.findElement(By.cssSelector(cssDescendant)));
        assertEquals(passField, driver.findElement(By.cssSelector(css2ndChild)));
        assertEquals(passField, driver.findElement(By.cssSelector(cssSecondChildFromEnd)));

        assertTrue(cssDescendant.contains("."));
        assertTrue(css2ndChild.contains(":nth-child"));
        assertTrue(cssSecondChildFromEnd.contains("nth-last"));
    }

    @Test
    public void locateLogInButton() {

        // Define Locators

        String cssLastChild = "";
        String cssThirdChild = "";
        String cssAttributeStartsWith = "";
        String cssAttributeEndsWith = "";
        String cssAttributeContains = "";
        String cssPreviousSiblings = "";



        // IGNORE THE DETAILS OF THE ASSERTIONS BELOW
        // ALL YOU NEED TO KNOW IS THAT IF YOU RUN THIS TEST
        // WITH THE RIGHT VALUES ABOVE IT WILL PASS

        WebElement logInButton = driver.findElement(By.cssSelector("input[value='LOGIN']"));

        assertEquals(logInButton, driver.findElement(By.cssSelector(cssLastChild)));
        assertEquals(logInButton, driver.findElement(By.cssSelector(cssThirdChild)));
        assertEquals(logInButton, driver.findElement(By.cssSelector(cssAttributeStartsWith)));
        assertEquals(logInButton, driver.findElement(By.cssSelector(cssAttributeEndsWith)));
        assertEquals(logInButton, driver.findElement(By.cssSelector(cssAttributeContains)));
        assertEquals(logInButton, driver.findElement(By.cssSelector(cssPreviousSiblings)));

        assertTrue(cssLastChild.contains(":last"));
        assertTrue(cssThirdChild.contains("nth-c"));
        assertTrue(cssAttributeStartsWith.contains("^="));
        assertTrue(cssAttributeEndsWith.contains("$="));
        assertTrue(cssAttributeContains.contains("*="));
        assertTrue(cssPreviousSiblings.contains(" ~ "));
    }

}