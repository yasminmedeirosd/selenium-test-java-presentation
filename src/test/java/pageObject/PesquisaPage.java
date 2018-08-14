package pageObject;

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
    String textNameRoomXpath = "//*[@id=\"reactSearch\"]/section/section/div/table/tbody/tr[1]/td[1]";
    String messageInvalidNameRoomClass = "terms-not-found";


    public void InsertNameRoom (String nameRoom){

        WriteText(By.className(textSearchClass), nameRoom);
    }

    public void ClickButtonSearch(){
        Click(By.xpath(buttonSearchXpath));
    }

    public void VerifyMessageValidSearch(String expectedTextNameRoom){
        Assert.assertEquals(ValidateText(By.id(messageSearchValidNameRoom)), expectedTextNameRoom);
    }

    public void VerifyValidRoomName(String expectedTextNameRoom){
        Assert.assertEquals(ValidateText(By.xpath(textNameRoomXpath)), expectedTextNameRoom);
    }

    public void  VerifyInvalidRoomName(String expectedTextMessage){
        Assert.assertEquals(ValidateText(By.className(messageInvalidNameRoomClass)),expectedTextMessage);
    }
}
