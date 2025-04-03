package srgst.practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class OrderScenarioUpperButtonTestFirefox {
    private WebDriver driver;

    private final String name;
    private final String surname;
    private final String adress;
    private final String metro;
    private final String telephone;
    private final String dateDelivery;
    private final String comment;

    public OrderScenarioUpperButtonTestFirefox(String name, String surname, String adress, String metro, String telephone, String dateDelivery, String comment) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.metro = metro;
        this.telephone = telephone;
        this.dateDelivery = dateDelivery;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getUserInfo() {
        return new Object[][]{
                {
                        "Тиль", "Линдеманн", "Москва, ул.Бажова, д.26", "ВДНХ", "88005553535", "04.04.2025", "Хочу кататься по Москве"
                },
                {
                        "Рихард", "Круспе", "Москва, ул.Тверская, д.10", "Лубянка", "89998887766", "05.04.2025", "На самокате можно многое успеть"
                },
        };
    }

    @Before
    public void startDriver() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");


    }

    @Test

    public void checkOrderConfirmScenario() throws InterruptedException {

        ButtonsMainPage buttonsMainPage = new ButtonsMainPage(driver);
        //Принимаем Куки
        buttonsMainPage.clickOnCookieButton();

        //Нажимаем на кнопку Заказать
        buttonsMainPage.clickOnOrderButtonUpperSide();


        MainInformationUserOrderPage mainInformationUserOrderPage = new MainInformationUserOrderPage(driver);
        // Кликаем на поле Имя и заполняем его
        mainInformationUserOrderPage.clickOnNameField();
        mainInformationUserOrderPage.nameFieldSendData(name);

        //Кликаем на поле Фамилия и заполняем его
        mainInformationUserOrderPage.clickOnSurnameField();
        mainInformationUserOrderPage.surnameFieldSendData(surname);

        //Кликаем на поле Адрес и заполнем его
        mainInformationUserOrderPage.clickOnAddressField();
        mainInformationUserOrderPage.adressFieldSendData(adress);
        //Кликаем на поле Метро, заполняем его и кликаем на введенное название метро в выпадающем списке
        mainInformationUserOrderPage.clickOnMetroStationField();
        mainInformationUserOrderPage.metroStationFieldSendData(metro);
        //Кликаем на поле Телефон и заполняем его
        mainInformationUserOrderPage.clickTelephoneField();
        mainInformationUserOrderPage.telephoneFieldSendData(telephone);
        //Кликаем на кнопку Далее
        mainInformationUserOrderPage.clickNextStepButton();

        OtherInfoOrderPage otherInfoOrderPage = new OtherInfoOrderPage(driver);
        //Кликаем на поле Когда привезти самокат, заполняем его и закрываем окно с выбором даты
        otherInfoOrderPage.clickDateDeliveryField();
        otherInfoOrderPage.dateDeliveryFieldSendData(dateDelivery);
        //Кликаем на поле Срок аренды и выбираем вариант Одни сутки из выпадающего списка
        otherInfoOrderPage.clickRentalPeriodField();
        otherInfoOrderPage.chooseRentalPeriodFromList();
        //Кликаем на Чекбокс "черный жемчуг" в поле Цвет самоката
        otherInfoOrderPage.clickCnColourField();
        //Кликаем на поле Комментарий для курьера и заполняем его
        otherInfoOrderPage.clickOnCommentField();
        otherInfoOrderPage.commentFieldSendData(comment);

        //Кликаем на кнопку Заказать
        otherInfoOrderPage.clickOnOrderButtonFinish();
        //Кликаем на кнопку Да для подтверждения заказа
        otherInfoOrderPage.clickOnConfirmOrderButton();
        //Проверяем, что появилось окно Заказ оформлен
        otherInfoOrderPage.checkOrderConfirm();


    }



    @After
    public void tearDown() {
        driver.quit();
    }
}
