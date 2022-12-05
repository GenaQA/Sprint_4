package firstpage;

import basetest.BaseTest;
import org.junit.Test;

public class FirstPage extends BaseTest {

//Для изменения бразуера для теста, изменить аргумент в BaseTest

    // тест для проверки корректности отображения текста в выпадающем списке
    @Test
    public void checkTextInItemPanel() throws InterruptedException {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        firstPage.clickAcceptCookie();
        firstPage.clickItemHeading();
    }


}
