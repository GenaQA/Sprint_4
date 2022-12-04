package Page.FirstPage;

import Page.BasePage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v105.page.Page;

public class FirstPage extends BasePage {
    int number;


    //Требуемые элементы

    //Кнопка "Заказать" в шапке
    private final By upButton = By.xpath("//*[@class='Button_Button__ra12g']");
    //Кнопка "Заказать" в теле
    private final By downButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка "да мы все привыкли" согласение на куки
    private final By clickAcceptCoockie = By.xpath("//*[@id='rcc-confirm-button']");

    //массив со всем ожидаемым текстом в панели
    String[] allTrueItemPanel = {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.","Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.","Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.","Только начиная с завтрашнего дня. Но скоро станем расторопнее.","Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.","Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.","Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.","Да, обязательно. Всем самокатов! И Москве, и Московской области."};

    public FirstPage(WebDriver driver) {
        super(driver);
    }

    // метод для проверки корректности текста в списке "Вопросы о важном"
    public void clickItemHeading() throws InterruptedException {
        for( number = 0; number <= 7 ; number ++){

            By itemHeading = By.xpath("//*[@id='accordion__heading-"+number+"']");
            driver.findElement(itemHeading).click();

            By itemPanel = By.xpath("//*[@id='accordion__panel-"+number+"']/p");

            Thread.sleep(1000);

            String textPanel =  driver.findElement(itemPanel).getText();

            Assert.assertEquals("Текст не сходится",allTrueItemPanel[number], textPanel);
        }
    }

    public void clickAcceptCookie(){
        driver.findElement(clickAcceptCoockie).click();
    }

    public void clickUpButton(){
        driver.findElement(upButton).click();
    }

    public void clickDownButton(){
        driver.findElement(downButton).click();
    }
}
