package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import dataProviders.LoginDataProvider;

public class LoginTest extends BaseTest {

    @Test(
        dataProvider = "loginData",
        dataProviderClass = LoginDataProvider.class
    )
    public void loginTest(
            String testCaseID,
            String username,
            String password,
            String expectedResult,
            String testType) {

        System.out.println("Test Case: " + testCaseID);

        driver.findElement(By.id("user-name"))
              .sendKeys(username);

        driver.findElement(By.id("password"))
              .sendKeys(password);

        driver.findElement(By.id("login-button"))
              .click();

        // Check actual result

        String actualResult;

        if (driver.getCurrentUrl().contains("inventory.html")) {

            actualResult = "Success";

        } else {

            actualResult = "Failure";
        }

        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);

        Assert.assertEquals(
                actualResult,
                expectedResult,
                "Login result mismatch for " + testCaseID
        );
    }
}