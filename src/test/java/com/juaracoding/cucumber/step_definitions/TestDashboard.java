package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.DashboardPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {

    WebDriver driver;
    private static ExtentTest extentTest;
    private DashboardPage dashboardPage = new DashboardPage();

    public TestDashboard() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu Dashboard")
    public void user_click_menu_dashboard() {
//		Hooks.delay(1);
        dashboardPage.menuDashboard();
        extentTest.log(LogStatus.PASS, "User click menu Dashboard");
    }

    @And("User on menu Dashboard")
    public void user_on_menu_dashboard() {
        //Sengaja fail untuk uji fungsi screenshot
        Assert.assertEquals(dashboardPage.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "User on menu Dashboard");
    }

    @And("User click menu Requirement")
    public void user_click_menu_requirement() {
        dashboardPage.menuRequirement();
        extentTest.log(LogStatus.PASS, "User click menu Requirement");
    }
    @And("User on menu Requirement")
    public void user_on_menu_requirement() {
        Assert.assertEquals(dashboardPage.getTxtRequirement(), "Recruitment");
        extentTest.log(LogStatus.PASS, "User on menu Requirement");
    }
    @And("User clik menu Add")
    public void user_clik_menu_add() {
        dashboardPage.menuAdd();
        extentTest.log(LogStatus.PASS, "User click menu Add");
    }
    @And("User enter firstname middlename lastname")
    public void user_enter_firstname_middlename_lastname() {
        dashboardPage.login("Cahya", "Septia", "Saa");
        extentTest.log(LogStatus.PASS, "User enter Full Name");
    }
    @And("User enter email")
    public void user_enter_email() {
       dashboardPage.email("caca@gmail.com");
        extentTest.log(LogStatus.PASS, "User enter Email");
    }
    @And("User click save")
    public void user_click_save() {
        dashboardPage.save();
        extentTest.log(LogStatus.PASS, "User click Save");

    }

    @Then("User get Application Stage")
    public void user_get_application_stage() {
        Assert.assertEquals(dashboardPage.txtAppStage(),"Application Stage");
        extentTest.log(LogStatus.PASS, "User Add Recruitment");
    }


}
