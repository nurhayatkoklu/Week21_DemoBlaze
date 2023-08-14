package TestCases;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase1_POM {

    public TestCase1_POM(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath ="//a[text()='Welcome T3st@gmail.com']")
    public WebElement loginSuccess;

    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phonesButton;

    @FindBy(linkText = "Samsung galaxy s6")
    public WebElement phoneCheck;

    @FindBy(xpath = "//a[text()='Laptops']")
    public WebElement laptopButton;

    @FindBy(linkText = "Sony vaio i5")
    public WebElement laptopCheck;

    @FindBy(xpath = "//a[text()='Monitors']")
    public WebElement monitorButton;

    @FindBy(xpath = "//p[contains(text(),'inch')]")
    public WebElement monitorCheck;

    @FindBy(id = "logout2")
    public WebElement logoutButton;

    @FindBy(id = "login2")
    public WebElement logoutSuccess;
}
