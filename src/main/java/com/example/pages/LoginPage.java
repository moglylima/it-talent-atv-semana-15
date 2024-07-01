package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.className("radius");
    By flashMessage = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public LoginPage openPage() {
        openPage("https://the-internet.herokuapp.com/login");
        return this;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getCurrentUrl() {
        return super.getCurrentUrl();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getFlashMessage() {
        return driver.findElement(flashMessage).getText();
    }

    public void closedPage() {
        super.closedPage();
    }

}
