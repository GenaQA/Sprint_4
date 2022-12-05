package Page.BasePage;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;

    }

}
