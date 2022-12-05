package basetest;

import CommonAction.CommonAction;
import Page.AboutRent.AboutRent;
import Page.FirstPage.FirstPage;
import Page.ScooterFor.ScooterFor;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    //Для изменения браузера для теста сменить аргумент "mac_chrome"/"mac_firefox"
    protected WebDriver driver = CommonAction.createDriver("mac_chrome");
    protected FirstPage firstPage = new FirstPage(driver);
    protected ScooterFor scooterFor = new ScooterFor(driver);
    protected AboutRent aboutRent = new AboutRent(driver);


@After
public void  quitDriver(){
    driver.quit();
}
}
