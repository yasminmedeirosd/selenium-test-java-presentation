package br.com.presentation.pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PesquisaPage extends BasePage {

    public PesquisaPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String textSearchClass = "InputWithPopup-input";
    String buttonSearchXpath = "/html/body/div[5]/section/div/form/div[1]/button";
    String messageSearchValidNameRoom = "room-search";
    String messageInvalidNameRoomClass = "search-not-found-help";


    public void InsertNameRoom (String nameRoom){

        WriteText(By.className(textSearchClass), nameRoom);
    }

    public void ClickButtonSearch(){
        Click(By.xpath(buttonSearchXpath));
    }

    public void VerifyMessageValidSearch(String expectedTextNameRoom){
        Assert.assertEquals(expectedTextNameRoom, ValidateText(By.className(messageSearchValidNameRoom)));
    }

    public void  VerifyInvalidRoomName(String expectedTextMessage){
        Assert.assertEquals(expectedTextMessage, ValidateText(By.className(messageInvalidNameRoomClass)));
    }
}
