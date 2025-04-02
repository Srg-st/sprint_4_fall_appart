package srgst.practikum;


import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;


public class MainPage {
    private WebDriver driver;

    public static final String SCOOTER_URL = "https://qa-scooter.praktikum-services.ru";

    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    private final By orderButtonUpperSide = By.xpath(".//button[@class='Button_Button__ra12g']");

    private final By orderButtonLowerSide = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    private final By lowerOrderButtonLocation = By.className("Home_RoadMap__2tal_");

    private final By questionsBlockLocation = By.className("Home_FourPart__1uthg");

    private static final By QUESTION_ABOUT_PRICE = By.xpath("//*[@id='accordion__heading-0']");
    private static final By QUESTION_ABOUT_QUANTITY = By.xpath("//*[@id='accordion__heading-1']");
    private static final By QUESTION_ABOUT_RENTAL_TIME = By.xpath("//*[@id='accordion__heading-2']");
    private static final By QUESTION_ABOUT_RENTAL_TODAY = By.xpath("//*[@id='accordion__heading-3']");
    private static final By QUESTION_ABOUT_RENTAL_PERIOD = By.xpath("//*[@id='accordion__heading-4']");
    private static final By QUESTION_ABOUT_CHARGER = By.xpath("//*[@id='accordion__heading-5']");
    private static final By QUESTION_ABOUT_CANCEL_ORDER = By.xpath("//*[@id='accordion__heading-6']");
    private static final By QUESTION_ABOUT_DELIVERY_DISTANCE = By.xpath("//*[@id='accordion__heading-7']");

    private static final By ANSWER_ABOUT_PRICE_ON_WEB = By.xpath("//*[@id='accordion__panel-0']/p");
    private static final By ANSWER_ABOUT_QUANTITY_ON_WEB = By.xpath("//*[@id='accordion__panel-1']/p");
    private static final By ANSWER_ABOUT_RENTAL_TIME_ON_WEB = By.xpath("//*[@id='accordion__panel-2']/p");
    private static final By ANSWER_ABOUT_RENTAL_TODAY_ON_WEB = By.xpath("//*[@id='accordion__panel-3']/p");
    private static final By ANSWER_ABOUT_RENTAL_PERIOD_ON_WEB = By.xpath("//*[@id='accordion__panel-4']/p");
    private static final By ANSWER_ABOUT_CHARGER_ON_WEB = By.xpath("//*[@id='accordion__panel-5']/p");
    private static final By ANSWER_ABOUT_CANCEL_ORDER = By.xpath("//*[@id='accordion__panel-6']/p");
    private static final By ANSWER_ABOUT_DELIVERY_DISTANCE_ON_WEB = By.xpath("//*[@id='accordion__panel-7']/p");

    public static By getQuestionAboutPrice(){
        return QUESTION_ABOUT_PRICE;
    }

    public static By getQuestionAboutQuantity() {
        return QUESTION_ABOUT_QUANTITY;
    }

    public static By getQuestionAboutRentalTime(){
        return QUESTION_ABOUT_RENTAL_TIME;
    }

    public static By getQuestionAboutRentalToday() {
        return QUESTION_ABOUT_RENTAL_TODAY;
    }

    public static By getQuestionAboutRentalPeriod() {
        return QUESTION_ABOUT_RENTAL_PERIOD;
    }

    public static By getQuestionAboutCharger() {
        return QUESTION_ABOUT_CHARGER;
    }

    public static By getQuestionAboutCancelOrder() {
        return QUESTION_ABOUT_CANCEL_ORDER;
    }

    public static By getQuestionAboutDeliveryDistance(){
        return QUESTION_ABOUT_DELIVERY_DISTANCE;
    }

    public static By getAnswerAboutPriceOnWeb() {
        return ANSWER_ABOUT_PRICE_ON_WEB;
    }

    public static By getAnswerAboutQuantityOnWeb() {
        return ANSWER_ABOUT_QUANTITY_ON_WEB;
    }

    public static By getAnswerAboutRentalTimeOnWeb() {
        return ANSWER_ABOUT_RENTAL_TIME_ON_WEB;
    }

    public static By getAnswerAboutRentalTodayOnWeb() {
        return ANSWER_ABOUT_RENTAL_TODAY_ON_WEB;
    }

    public static By getAnswerAboutRentalPeriodOnWeb() {
        return ANSWER_ABOUT_RENTAL_PERIOD_ON_WEB;
    }

    public static By getAnswerAboutChargerOnWeb() {
        return ANSWER_ABOUT_CHARGER_ON_WEB;
    }

    public static By getAnswerAboutCancelOrderOnWeb() {
        return ANSWER_ABOUT_CANCEL_ORDER;
    }

    public static By getAnswerAboutDeliveryDistanceOnWeb() {
        return ANSWER_ABOUT_DELIVERY_DISTANCE_ON_WEB;
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCookieButton(){
        driver.findElement(cookieButton).click();
    }

    public void scrollToLowerOrderButton() {
        WebElement element = driver.findElement(lowerOrderButtonLocation);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickOnOrderButtonUpperSide() {
        driver.findElement(orderButtonUpperSide).click();
    }

    public void clickOnOrderButtonLowerSide() {
        driver.findElement(orderButtonLowerSide).click();
    }

    public void scrollToQuestionsBlock(){
        WebElement element = driver.findElement(questionsBlockLocation);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }



    public void checkTextOnAnswer(By questionAbout, By answerOnWeb, String expectedTextAnswer){
        driver.findElement(questionAbout).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(answerOnWeb));
        String textInAnswer = driver.findElement(answerOnWeb).getText();
        MatcherAssert.assertThat(expectedTextAnswer, is(textInAnswer));
    }



}
