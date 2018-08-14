package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

     @BeforeClass
     public void Setup () {
          //Create a Chrome driver. All test and page classes use this driver.

         driver = new ChromeDriver();
            //Maximize Window
            driver.manage().window().maximize();
     }

      @AfterClass
      public void Quit () {

         driver.quit();
     }

     public void GoToBatePapoUOL(){

         driver.get("https://batepapo.uol.com.br/");
     }
}
