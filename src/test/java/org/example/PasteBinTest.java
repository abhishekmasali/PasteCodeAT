package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PasteBinTest {

    private WebDriver driver;
    private PastebinPage pastebinPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSingleton.getDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");

        pastebinPage = new PastebinPage(driver);
    }

    @Test
    public void testCreateNewPaste() {
        pastebinPage.createNewPaste("Hello from WebDriver",  "10 Minutes","helloweb");
    }

    @AfterClass
    public void tearDown() {
        WebDriverSingleton.quitDriver();
    }
}
