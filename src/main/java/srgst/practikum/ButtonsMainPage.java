package srgst.practikum;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ButtonsMainPage {
    private WebDriver driver;

    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    private final By orderButtonUpperSide = By.xpath("//*[@id='root']/div/div[1]/div[1]/div[2]/button[1]");

    private final By orderButtonLowerSide = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");








    public ButtonsMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCookieButton(){
        driver.findElement(cookieButton).click();
    }

    public void scrollToLowerOrderButton() {
        WebElement element = driver.findElement(By.className("Home_RoadMap__2tal_"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickOnOrderButtonUpperSide() {
        driver.findElement(orderButtonUpperSide).click();
    }

    public void clickOnOrderButtonLowerSide() {
        driver.findElement(orderButtonLowerSide).click();
    }


}
