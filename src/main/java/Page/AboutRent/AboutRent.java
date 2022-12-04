package Page.AboutRent;

import Page.BasePage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRent extends BasePage {
    public AboutRent(WebDriver driver) {
        super(driver);
    }

    //Страница "Про аренду"
    //поле выбора даты
    private final By fieldDate = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/input");
    //Дата из виджета
    private final By chooseDate = By.xpath("//*[@class='react-datepicker__day react-datepicker__day--015']");
    //Поле "Срок аренды"
    private final By fieldPeriodRent = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    //выбранный срок из списка
    private final By periodRent = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[5]");
    //чек бокс черного цвета
    private final By blackColorScooter = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/label[1]");
    //чек бокс серого цвета
    private final By greyColorScooter = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/label[2]");
    //Поле комментария
    private final By fieldComment = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/input");
    //Кнопка в поп ап окне "Да"
    private final By buttonYes = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]");
    // Блок с текстом об успешном создании заказа
    private final By fieldSuccessfulResult = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[1]");

    public void chooseDateInField(){
        driver.findElement(fieldDate).click();
        driver.findElement(chooseDate).click();
    }

    public void choosePeriodRent(){
        driver.findElement(fieldPeriodRent).click();
        driver.findElement(periodRent).click();
    }
    public void chooseBlackColorScooter(){
        driver.findElement(blackColorScooter).click();
    }

    public void chooseGreyColorScooter(){
        driver.findElement(greyColorScooter).click();
    }

    public void textFieldComment(String text){
        driver.findElement(fieldComment).sendKeys(text);
    }

    public void clickButtonYes(){
        driver.findElement(buttonYes).click();
    }


    public void checkSuccessfulOrder() {
        String actual = driver.findElement(fieldSuccessfulResult).getText();
        Assert.assertNotEquals("Текст сходится. Пользователь остался на моменте подтверждения заказа", "Хотите оформить заказ?\n" + " ", actual);
    }
}
