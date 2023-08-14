package TestCases;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseDriver {
    @Test
    public void testcase2() throws InterruptedException {

        int expectedTotal = 0;

        login();
        TestCase2_POM pom2 = new TestCase2_POM();
        Thread.sleep(2000);
        Assert.assertTrue(pom2.loginsucces.getText().contains("Log"));

        pom2.phonesButton.click();

        pom2.samsungS6.click();
        String samsungPrice = pom2.price.getText().replaceAll("[^0-9]", "");
        expectedTotal = expectedTotal + Integer.parseInt(samsungPrice);

        pom2.addToCard.click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        pom2.homeButton.click();

        pom2.phonesButton.click();

        Thread.sleep(1000);
        pom2.Nexus6.click();
        String nexusPrice = pom2.price.getText().replaceAll("[^0-9]", "");
        expectedTotal = expectedTotal + Integer.parseInt(nexusPrice);
        String stringTotal = String.valueOf(expectedTotal);
        pom2.addToCard.click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        pom2.cartButton.click();

        Thread.sleep(2000);

        Assert.assertEquals(stringTotal, pom2.TotalPrice.getText().toString());

        pom2.PlaceOrderCheck.click();

        pom2.firstName.sendKeys("John");
        pom2.country.sendKeys("Doe");
        pom2.city.sendKeys("New York");
        pom2.card.sendKeys("1345678");
        pom2.month.sendKeys("June");
        pom2.year.sendKeys("2026");
        pom2.purchaseButton.click();


        Thread.sleep(2000);
        System.out.println(pom2.id.getText());
        Assert.assertTrue(pom2.id.isDisplayed());

        Assert.assertTrue(pom2.id.getText().contains("Id:"));
        Assert.assertTrue(pom2.id.getText().contains("Amount: " + stringTotal));
        Assert.assertTrue(pom2.id.getText().contains("Card Number:"));
        Assert.assertTrue(pom2.id.getText().contains("Name:"));
        Assert.assertTrue(pom2.id.getText().contains("Date:"));

        pom2.okeyButton.click();
    }
}
