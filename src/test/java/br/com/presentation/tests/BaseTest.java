package br.com.presentation.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

     @BeforeClass
     public static void Setup () {
         System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
         driver = new ChromeDriver();
            //Maximize Window
            driver.manage().window().maximize();
     }

      @AfterClass
      public static void Quit () {

         driver.quit();
     }

     public void GoToBatePapoUOL(){

         driver.get("https://batepapo.uol.com.br/");
     }
}
