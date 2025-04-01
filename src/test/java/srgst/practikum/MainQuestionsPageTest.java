package srgst.practikum;



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
                        By.xpath("//*[@id='accordion__heading-0']"), By.xpath("//*[@id='accordion__panel-0']/p"), "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
                },
                {
                        By.xpath("//*[@id='accordion__heading-1']"), By.xpath("//*[@id='accordion__panel-1']/p"), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
                },
                {
                        By.xpath("//*[@id='accordion__heading-2']"), By.xpath("//*[@id='accordion__panel-2']/p"), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {
                        By.xpath("//*[@id='accordion__heading-3']"), By.xpath("//*[@id='accordion__panel-3']/p"), "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {
                        By.xpath("//*[@id='accordion__heading-4']"), By.xpath("//*[@id='accordion__panel-4']/p"), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {
                        By.xpath("//*[@id='accordion__heading-5']"), By.xpath("//*[@id='accordion__panel-5']/p"), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
                },
                {
                        By.xpath("//*[@id='accordion__heading-6']"), By.xpath("//*[@id='accordion__panel-6']/p"), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
                },
                {
                        By.xpath("//*[@id='accordion__heading-7']"), By.xpath("//*[@id='accordion__panel-7']/p"), "Да, обязательно. Всем самокатов! И Москве, и Московской области."
                },
        };
    }


    @Before
    public void startDriver() {

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



