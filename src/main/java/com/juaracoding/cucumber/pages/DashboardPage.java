package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement menuDashboard;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtDashboard;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
    WebElement menuRequirement;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtRequirement;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement menuAdd;

    @FindBy(name = "firstName")
    WebElement fname;

    @FindBy(name = "middleName")
    WebElement midname;

    @FindBy(name = "lastName")
    WebElement lname;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement save;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    WebElement txtAppStage;

    public void menuDashboard(){
        menuDashboard.click();
    }
    
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public void menuRequirement(){
        menuRequirement.click();
    }

    public String getTxtRequirement(){
        return txtRequirement.getText();
    }

    public void menuAdd(){
        menuAdd.click();
    }

    public void login(String fname, String midname, String lname){
        this.fname.sendKeys(fname);
        this.midname.sendKeys(midname);
        this.lname.sendKeys(lname);
    }

    public void email(String email){
//        email.click();
        this.email.sendKeys(email);
    }

    public void save(){
        save.click();
    }

    public String txtAppStage () {
        return txtAppStage.getText();
    }
}
