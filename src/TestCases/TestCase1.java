package TestCases;

import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseDriver {

    @Test
    void demoBlaze(){
        login();

        TestCase1_POM pom1 = new TestCase1_POM();
        Assert.assertTrue(pom1.loginSuccess.getText().contains("Welcome"));

        pom1.phonesButton.click();
        Assert.assertTrue(pom1.phoneCheck.getText().contains("galaxy s6"));

        pom1.laptopButton.click();
        Assert.assertTrue(pom1.laptopCheck.getText().contains("vaio i5"));

        pom1.monitorButton.click();
        Assert.assertTrue(pom1.monitorCheck.getText().contains("inch"));

        pom1.logoutButton.click();
        Assert.assertTrue(pom1.logoutSuccess.isDisplayed());

    }



}
