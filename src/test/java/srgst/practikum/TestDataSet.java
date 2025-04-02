package srgst.practikum;

import org.openqa.selenium.By;

public class TestDataSet {

    private static final String TEXT_ANSWER_ABOUT_PRICE = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private static final String TEXT_ANSWER_ABOUT_QUANTITY = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private static final String TEXT_ANSWER_ABOUT_RENTAL_TIME = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private static final String TEXT_ANSWER_ABOUT_RENTAL_TODAY = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private static final String TEXT_ANSWER_ABOUT_RENTAL_PERIOD = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private static final String TEXT_ANSWER_ABOUT_CHARGER = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private static final String TEXT_ANSWER_ABOUT_CANCEL_ORDER = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private static final String TEXT_ANSWER_ABOUT_DELIVERY_DISTANCE = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    public static String getTextAnswerAboutPrice(){
        return TEXT_ANSWER_ABOUT_PRICE;
    }

    public static String getTextAnswerAboutQuantity() {
        return TEXT_ANSWER_ABOUT_QUANTITY;
    }

    public static String getTextAnswerAboutRentalTime() {
        return TEXT_ANSWER_ABOUT_RENTAL_TIME;
    }

    public static String getTextAnswerAboutRentalToday() {
        return TEXT_ANSWER_ABOUT_RENTAL_TODAY;
    }

    public static String getTextAnswerAboutRentalPeriod() {
        return TEXT_ANSWER_ABOUT_RENTAL_PERIOD;
    }

    public static String getTextAnswerAboutCharger() {
        return TEXT_ANSWER_ABOUT_CHARGER;
    }

    public static String getTextAnswerAboutCancelOrder() {
        return TEXT_ANSWER_ABOUT_CANCEL_ORDER;
    }

    public static String getTextAnswerAboutDeliveryDistance() {
        return TEXT_ANSWER_ABOUT_DELIVERY_DISTANCE;
    }
}