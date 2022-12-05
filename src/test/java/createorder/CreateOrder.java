package createorder;

import basetest.BaseTest;
import org.junit.Test;


public class CreateOrder extends BaseTest {

    //Для изменения бразуера для теста, изменить аргумент в BaseTest

    //Проход положительного сценария до Поп-Ап окна с результатом
    @Test
    public void baseCreateOrder() {
        driver.get("https://qa-scooter.praktikum-services.ru");
        firstPage.clickUpButton();
        scooterFor.textFieldName("Гена");
        scooterFor.textFieldFamily("Чиба");
        scooterFor.textFieldAdress("Симферополь");
        scooterFor.clickStationAndChooseStation();
        scooterFor.textFieldNumber("89780000000");
        scooterFor.clickButtonNext();
        aboutRent.chooseDateInField();
        aboutRent.choosePeriodRent();
        aboutRent.chooseBlackColorScooter();
        aboutRent.textFieldComment("Оплата безНал");
        firstPage.clickDownButton();
        aboutRent.clickButtonYes();
        aboutRent.checkSuccessfulOrder();
    }


    //Проход положительного сценария до Поп-Ап окна с результатами начиная с кнопки с "Заказать" из тела  + серый цвет
    @Test
    public void createOrderAllColorScooter() {
        driver.get("https://qa-scooter.praktikum-services.ru");
        firstPage.clickAcceptCookie();
        firstPage.clickDownButton();
        scooterFor.textFieldName("Гена");
        scooterFor.textFieldFamily("Чиба");
        scooterFor.textFieldAdress("Симферополь");
        scooterFor.clickStationAndChooseStation();
        scooterFor.textFieldNumber("89780000000");
        scooterFor.clickButtonNext();
        aboutRent.chooseDateInField();
        aboutRent.choosePeriodRent();
        aboutRent.chooseBlackColorScooter();
        aboutRent.chooseGreyColorScooter();
        aboutRent.textFieldComment("Оплата безНал");
        aboutRent.clickButtonOrder();
        aboutRent.clickButtonYes();
        aboutRent.checkSuccessfulOrder();
    }

    //Проход теста без заполненого имени в разделе "Для кого самокат"
    @Test
    public void createOrderWithoutName(){
        driver.get("https://qa-scooter.praktikum-services.ru");
        firstPage.clickAcceptCookie();
        firstPage.clickDownButton();
        scooterFor.textFieldFamily("Чиба");
        scooterFor.textFieldAdress("Симферополь");
        scooterFor.clickStationAndChooseStation();
        scooterFor.textFieldNumber("89780000000");
        scooterFor.clickButtonNext();
        scooterFor.checkErrorMessageFieldName();

    }
}