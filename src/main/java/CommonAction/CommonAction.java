package CommonAction;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import org.openqa.selenium.firefox.FirefoxDriver;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class CommonAction {
    private  static WebDriver driver;



    public static final int IMPLICIT_WAIT = 10;

    public CommonAction(WebDriver driver) {
    }

    @Before
    public static WebDriver createDriver(String browser)  {
        if(driver == null){
            if (browser == "mac_chrome") {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
            } else if (browser == "mac_firefox") {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                driver = new FirefoxDriver();
            } else {
                Assert.fail("Incorrect platform or browser name: " + browser);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }

        return  driver;
    }











}
