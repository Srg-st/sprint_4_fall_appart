package srgst.practikum;



import com.sun.tools.javac.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@RunWith(Parameterized.class)
public class MainQuestionsPageTest {
    private WebDriver driver;

    private final By questionAbout;
    private final By answerOnWeb;
    private final String expectedTextAnswer;

    public MainQuestionsPageTest(By questionAbout, By answerOnWeb, String expectedTextAnswer) {
        this.questionAbout = questionAbout;
        this.answerOnWeb = answerOnWeb;
        this.expectedTextAnswer = expectedTextAnswer;
    }

    @Parameterized.Parameters
    public static Object[][] checkTextInAnswerBlock() {
        return new Object[][]{
                {
                        MainPage.getQuestionAboutPrice(), MainPage.getAnswerAboutPriceOnWeb(), TestDataSet.getTextAnswerAboutPrice()
                },
                {
                        MainPage.getQuestionAboutQuantity(), MainPage.getAnswerAboutQuantityOnWeb(), TestDataSet.getTextAnswerAboutQuantity()
                },
                {
                        MainPage.getQuestionAboutRentalTime(), MainPage.getAnswerAboutRentalTimeOnWeb(), TestDataSet.getTextAnswerAboutRentalTime()},
                {
                        MainPage.getQuestionAboutRentalToday(), MainPage.getAnswerAboutRentalTodayOnWeb(), TestDataSet.getTextAnswerAboutRentalToday()},
                {
                        MainPage.getQuestionAboutRentalPeriod(), MainPage.getAnswerAboutRentalPeriodOnWeb(), TestDataSet.getTextAnswerAboutRentalPeriod()},
                {
                        MainPage.getQuestionAboutCharger(), MainPage.getAnswerAboutChargerOnWeb(), TestDataSet.getTextAnswerAboutCharger()
                },
                {
                        MainPage.getQuestionAboutCancelOrder(), MainPage.getAnswerAboutCancelOrderOnWeb(), TestDataSet.getTextAnswerAboutCancelOrder()
                },
                {
                        MainPage.getQuestionAboutDeliveryDistance(), MainPage.getAnswerAboutDeliveryDistanceOnWeb(), TestDataSet.getTextAnswerAboutDeliveryDistance()
                },
        };
    }


    @Before
    public void startDriver() {
        //Реализация выбора браузера
        String browser = System.getProperty("browser","chrome");
        WebDriverFactory factory = WebDriverFactoryBrowser.getFactory(browser);
        driver = factory.driver();


    }

    @Test

    public void checkTextInAnswer(){
        MainPage mainPage = new MainPage(driver);

        mainPage.scrollToQuestionsBlock();
        mainPage.checkTextOnAnswer(questionAbout, answerOnWeb, expectedTextAnswer);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}



