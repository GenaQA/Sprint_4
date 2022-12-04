package Page.ScooterFor;

import Page.BasePage.BasePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScooterFor extends BasePage {

    //Страница "Для кого самокат"

    //поле имя
    private final By fieldName = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/input");
    //поле фамилия
    private final By fieldFamily = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/input");
    //поле Адрес
    private final By fieldAress = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/input");
    //поле Поле выбора станции
    private final By fieldStationMetro = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div/input");
    //станция из списка
    private final By chooseStationMetro = By.xpath("//*[@class='select-search__select']/ul/li[1]");
    //поле номера телефона
    private final By fieldNumber = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[5]/input");
    //Кнопка "Далее"
    private final By btnNext = By.xpath("//*[@id='root']/div/div[2]/div[3]/button");
    //уведомление о отсутствии текста у поля "Имя"
    private final By messageErrorName = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div");

    public void textFieldName(String name){
        driver.findElement(fieldName).sendKeys(name);
    }

    public void textFieldFamily(String family){
        driver.findElement(fieldFamily).sendKeys(family);
    }

    public void textFieldAdress(String adress){
        driver.findElement(fieldAress).sendKeys(adress);
    }

    public void clickStationAndChooseStation(){
        driver.findElement(fieldStationMetro).click();
        driver.findElement(chooseStationMetro).click();
    }

    public void textFieldNumber(String number){
        driver.findElement(fieldNumber).sendKeys(number);
    }

    public void clickButtonNext(){
        driver.findElement(btnNext).click();
    }



    public void checkErrorMessageFieldName(){
        String textError = driver.findElement(messageErrorName).getText();
        Assert.assertEquals("Сообщение об ошибке не выводится под полем", "Введите корректное имя", textError);
    }




    public ScooterFor(WebDriver driver) {
        super(driver);
    }




}







