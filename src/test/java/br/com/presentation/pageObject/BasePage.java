package br.com.presentation.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Método Construtor
    public BasePage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    //Click Method
    public void Click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void WriteText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String ValidateText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
}
