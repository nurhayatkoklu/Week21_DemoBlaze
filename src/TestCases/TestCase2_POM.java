package TestCases;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestCase2_POM {


    public TestCase2_POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[text()=\"Log out\"]")
    public WebElement loginsucces;

    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phonesButton;

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    public WebElement samsungS6;

    @FindBy(className = "price-container")
    public WebElement price;

    @FindBy(xpath = "//a[text()='Nexus 6']")
    public WebElement Nexus6;

    @FindBy(xpath = "//a[text()='Home ']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public  WebElement addToCard;

    @FindBy(xpath = "//a[text()='Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement PlaceOrderCheck;

    @FindBy(id = "totalp")
    public WebElement TotalPrice;

    @FindBy(xpath = "//tbody[@id=\"tbodyid\"]//tr[@class='success']//td[text()='360']")
    public List<WebElement> list;

    @FindBy(id = "name")
    public WebElement firstName;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement card;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okeyButton;

    @FindBy(xpath = "(//div[@class='sweet-alert  showSweetAlert visible'] //p)[1]")
    public  WebElement id;



}
