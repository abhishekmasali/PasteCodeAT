package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {

    }

    public static WebDriver getDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
