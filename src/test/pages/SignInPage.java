package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Implement Methods & Elements to allow LoginTest tests to pass

public class SignInPage {
    private WebDriver driver;

    private SignInPage(WebDriver driver) {
        this.driver = driver;
    }
