package srgst.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainInformationUserOrderPage {
    private WebDriver driver;
    private final By nameField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
    private final By surnameField = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
    private final By adressField = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
    private final By metroStationField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
    private final By metroStationFromList = By.className("select-search__select");
    private final By telephoneField = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");

    private final By nextStepButton = By.xpath("/html/body/div/div/div[2]/div[3]/button");

    public MainInformationUserOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNameField() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(nameField));
        driver.findElement(nameField).click();
    }

    public void nameFieldSendData(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void clickOnSurnameField() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(surnameField));
        driver.findElement(surnameField).click();
    }

    public void surnameFieldSendData(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void clickOnAddressField() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(adressField));
        driver.findElement(adressField).click();
    }
    public void adressFieldSendData(String adress){
        driver.findElement(adressField).sendKeys(adress);
    }

    public void clickOnMetroStationField(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(metroStationField));
        driver.findElement(metroStationField).click();
    }
    public void metroStationFieldSendData(String metro){
        driver.findElement(metroStationField).sendKeys(metro);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(metroStationFromList));
        driver.findElement(metroStationFromList).click();
    }

    public void clickTelephoneField(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(telephoneField));
        driver.findElement(telephoneField).click();
    }
    public void telephoneFieldSendData(String telephone){
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    public void clickNextStepButton(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(nextStepButton));
        driver.findElement(nextStepButton).click();
    }
}
