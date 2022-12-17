package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtEmployeeInformation;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    WebElement txtInvalidCredentials;
    
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement txtRequired;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
     WebElement txtDashboard;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getTxtEmployeeInformation(){
        return txtEmployeeInformation.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }

    public String getTxtRequired(){
        return txtRequired.getText();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

}
