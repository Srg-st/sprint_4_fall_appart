package srgst.practikum;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

public class MainQuestionsPage {
    private WebDriver driver;

    private final By firstQuestion = By.xpath("//*[@id='accordion__heading-0']");
    private final By secondQuestion = By.xpath("//*[@id='accordion__heading-1']");
    private final By thirdQuestion = By.xpath("//*[@id='accordion__heading-2']");
    private final By fourthQuestion = By.xpath("//*[@id='accordion__heading-3']");
    private final By fifthQuestion = By.xpath("//*[@id='accordion__heading-4']");
    private final By sixthQuestion = By.xpath("//*[@id='accordion__heading-5']");
    private final By seventhQuestion = By.xpath("//*[@id='accordion__heading-6']");
    private final By eighthQuestion = By.xpath("//*[@id='accordion__heading-7']");

    private final By firstAnswerOnWeb = By.xpath("//*[@id='accordion__panel-0']/p");
    private final By secondAnswerOnWeb = By.xpath("//*[@id='accordion__panel-1']/p");
    private final By thirdAnswerOnWeb = By.xpath("//*[@id='accordion__panel-2']/p");
    private final By fourthAnswerOnWeb = By.xpath("//*[@id='accordion__panel-3']/p");
    private final By fifthAnswerOnWeb = By.xpath("//*[@id='accordion__panel-4']/p");
    private final By sixthAnswerOnWeb = By.xpath("//*[@id='accordion__panel-5']/p");
    private final By seventhAnswerOnWeb = By.xpath("//*[@id='accordion__panel-6']/p");
    private final By eighthAnswerOnWeb = By.xpath("//*[@id='accordion__panel-7']/p");

    private final String firstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String secondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String thirdAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String fourthAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String fifthAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String sixthAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String seventhAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String eighthAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public MainQuestionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToQuestionsBlock(){
        WebElement element = driver.findElement(By.className("Home_FourPart__1uthg"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void checkTextOnFirstQuestion(){
        driver.findElement(firstQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(firstAnswerOnWeb));
        String textInFirstAnswer = driver.findElement(firstAnswerOnWeb).getText();
        MatcherAssert.assertThat(firstAnswerText, is(textInFirstAnswer));
    }

    public void checkTextOnSecondQuestion(){
        driver.findElement(secondQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(secondAnswerOnWeb));
        String textInSecondAnswer = driver.findElement(secondAnswerOnWeb).getText();
        Assert.assertEquals("Текст во второй кнопке не соответствует действительности", secondAnswerText, textInSecondAnswer);
    }

    public void checkTextOnThirdQuestion(){
        driver.findElement(thirdQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(thirdAnswerOnWeb));
        String textInThirdAnswer = driver.findElement(thirdAnswerOnWeb).getText();
        Assert.assertEquals("Текст в третьей кнопке не соответствует действительности", thirdAnswerText, textInThirdAnswer);
    }

    public void checkTextOnFourthQuestion(){
        driver.findElement(fourthQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(fourthAnswerOnWeb));
        String textInFourthAnswer = driver.findElement(fourthAnswerOnWeb).getText();
        Assert.assertEquals("Текст в четвертой кнопке не соответствует действительности", fourthAnswerText, textInFourthAnswer);
    }

    public void checkTextOnFifthQuestion(){
        driver.findElement(fifthQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(fifthAnswerOnWeb));
        String textInFifthAnswer = driver.findElement(fifthAnswerOnWeb).getText();
        Assert.assertEquals("Текст в пятой кнопке не соответствует действительности", fifthAnswerText, textInFifthAnswer);
    }

    public void checkTextOnSixthQuestion(){
        driver.findElement(sixthQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(sixthAnswerOnWeb));
        String textInSixthAnswer = driver.findElement(sixthAnswerOnWeb).getText();
        Assert.assertEquals("Текст в шестой кнопке не соответствует действительности", sixthAnswerText, textInSixthAnswer);
    }

    public void checkTextOnSeventhQuestion(){
        driver.findElement(seventhQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(seventhAnswerOnWeb));
        String textInSeventhAnswer = driver.findElement(seventhAnswerOnWeb).getText();
        Assert.assertEquals("Текст в седьмой кнопке не соответствует действительности", seventhAnswerText, textInSeventhAnswer);
    }

    public void checkTextOnEighthQuestion(){
        driver.findElement(eighthQuestion).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(eighthAnswerOnWeb));
        String textInEighthAnswer = driver.findElement(eighthAnswerOnWeb).getText();
        Assert.assertEquals("Текст в восьмой кнопке не соответствует действительности", eighthAnswerText, textInEighthAnswer);
    }


}
