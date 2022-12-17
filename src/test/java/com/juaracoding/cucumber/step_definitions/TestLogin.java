package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
    @When("User go to Web HRM")
    public void user_go_to_Web_HRM() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web HRM");

    }

    @And("User enter username password invalid")
    public void user_enter_username_password_invalid() {
        loginPage.login("Admin", "admin1234");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User invalid credentials")
    public void user_invalid_credentials() {
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Invalid credentials");
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

    // Test Case Two
    @When("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.login("Admin", "admin123");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login valid")
    public void user_click_button_login_valid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

    @Then("User valid credentials")
    public void user_valid_credentials() {
//        Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }
}
