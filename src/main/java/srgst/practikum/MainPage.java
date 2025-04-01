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

    private final By orderButtonLowerSide = By.xpath(".//div[5]/button");

    private final By lowerOrderButtonLocation = By.className("Home_RoadMap__2tal_");

    private final By questionsBlockLocation = By.className("Home_FourPart__1uthg");


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
