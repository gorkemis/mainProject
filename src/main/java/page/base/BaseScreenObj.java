package page.base;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreenObj {

    private DriverProvider driverProvider;

    public void waitForElementForClickable(By element){
        new WebDriverWait(driverProvider.driver, 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementForVisible(By element){
        new WebDriverWait(driverProvider.driver, 20)
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void click(By element){
        waitForElementForClickable(element);
        driverProvider.driver.findElement(element).click();
    }

    public String getText(By element) {
        waitForElementForVisible(element);
        return driverProvider.driver.findElement(element).getText();
    }
}
