package srgst.practikum;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;

public class OtherInfoOrderPage {

    private WebDriver driver;


    private final By dateDeliveryScooterField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input");

    private final By rentalPeriodField = By.className("Dropdown-placeholder");
    private final By dropDownList = By.className("Dropdown-menu");
    private final By oneDayRentalSelect = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]");

    private final By blackColourScooterField = By.id("black");

    private final By commentForCourierField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");

    private final By orderButtonFinish = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");

    private final By confirmOrderButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");

    private final By confirmWindow = By.className("Order_ModalHeader__3FDaJ");

    private final String orderConfirmText = "Заказ оформлен";

    public OtherInfoOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDateDeliveryField(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(dateDeliveryScooterField));
        driver.findElement(dateDeliveryScooterField).click();

    }
    public void dateDeliveryFieldSendData(String dateDelivery){
        driver.findElement(dateDeliveryScooterField).sendKeys(dateDelivery);
        //Закрываем окно с календарем с помощью клавиши Escape
        driver.findElement(dateDeliveryScooterField).sendKeys(Keys.ESCAPE);
    }

    public void clickRentalPeriodField(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(rentalPeriodField));
        driver.findElement(rentalPeriodField).click();
    }
    public void chooseRentalPeriodFromList(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(dropDownList));
        driver.findElement(oneDayRentalSelect).click();
    }

    public void clickCnColourField(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(blackColourScooterField));
        driver.findElement(blackColourScooterField).click();
    }

    public void clickOnCommentField(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(commentForCourierField));
        driver.findElement(commentForCourierField).click();
    }

    public void commentFieldSendData(String comment){
        driver.findElement(commentForCourierField).sendKeys(comment);
    }

    public void clickOnOrderButtonFinish(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(orderButtonFinish));
        driver.findElement(orderButtonFinish).click();
    }

    public void clickOnConfirmOrderButton(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(confirmOrderButton));
        driver.findElement(confirmOrderButton).click();
    }

    public void checkOrderConfirm(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(confirmWindow));
        String textOrder = driver.findElement(confirmWindow).getText();
        Assert.assertThat("Заказ не был сформирован", textOrder, containsString(orderConfirmText));

    }


}
