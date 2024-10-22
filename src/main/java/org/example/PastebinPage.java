package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinPage {

    private WebDriver driver;

    @FindBy(id = "postform-text")
    private WebElement codeField;

    @FindBy(id="select2-postform-expiration-container")
    private WebElement expirationDropdown;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement expirationOption;

    @FindBy(id="postform-name")
    private WebElement pasteNameTitle;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement createPasteButtion;

    public PastebinPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewPaste(String code, String expiration, String pasteName){

        codeField.sendKeys(code);
        expirationDropdown.click();
        expirationOption.click();
        pasteNameTitle.sendKeys(pasteName);
        createPasteButtion.click();
    }


}
