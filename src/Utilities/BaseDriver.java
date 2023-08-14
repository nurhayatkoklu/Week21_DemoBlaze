package Utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class BaseDriver {

        public static WebDriver driver;

        @BeforeClass
        public void createDriver() {
            closePreviousDrivers();
            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            Duration duration = Duration.ofSeconds(30);
            driver.manage().timeouts().pageLoadTimeout(duration);
            driver.manage().timeouts().implicitlyWait(duration);

        }

        @AfterClass
        public void quitDriver() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }

        public void closePreviousDrivers() {
            try {
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        public void login() {
            driver.get("https://www.demoblaze.com/index.html");

            WebElement login = driver.findElement(By.id("login2"));
            login.click();

            WebElement email = driver.findElement(By.id("loginusername"));
            email.sendKeys("kokk");

            WebElement password = driver.findElement(By.id("loginpassword"));
            password.sendKeys("Tokito");

            WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
            loginButton.click();


        }
    }
