package srgst.practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainQuestionsPageTest {
    private WebDriver driver;


    @Before
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);

        mainQuestionsPage.scrollToQuestionsBlock();
    }


    @Test
    public void checkTextFirstQuestion()  {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnFirstQuestion();

    }

    @Test
    public void checkTextSecondQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnSecondQuestion();

    }

    @Test
    public void checkTextThirdQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnThirdQuestion();

    }

    @Test
    public void checkTextFourthQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnFourthQuestion();

    }

    @Test
    public void checkTextFifthQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnFifthQuestion();

    }

    @Test
    public void checkTextSixthQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnSixthQuestion();

    }

    @Test
    public void checkTextSeventhQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnSeventhQuestion();

    }

    @Test
    public void checkTextEightQuestion() {
        MainQuestionsPage mainQuestionsPage = new MainQuestionsPage(driver);
        mainQuestionsPage.checkTextOnEighthQuestion();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
