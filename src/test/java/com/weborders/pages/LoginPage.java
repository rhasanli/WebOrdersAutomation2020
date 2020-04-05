package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    // userName and password hidden so we need method , which is below
    public void login() {
        String userNameValue = ConfigurationReader.getProperty("userName");
        String passwordValue = ConfigurationReader.getProperty("password");
        userName.sendKeys(userNameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    // overloading - same method name as above but different parameters
    public void login(String userNameValue, String passwordValue) {
        userName.sendKeys(userNameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }


}
