package page.base.authors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.base.BaseScreenObj;
import page.base.DriverProvider;

import java.util.List;

public class Authors extends BaseScreenObj {
    private DriverProvider driverProvider;

    private final By btn = (By.cssSelector("span[class='river-byline__authors']"));

    @FindBy(css = "div[class='river river--homepage '] img[src]")
    private List<WebElement> pictures;

    public String getAuthor() {
        return getText(btn);
    }

    public String getPicture() {
        return getText((By) pictures);
    }
}
