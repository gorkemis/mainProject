package page.base.articles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.base.BaseScreenObj;

import java.util.List;

public class Articles extends BaseScreenObj {

    @FindBy(css = "div[class='river river--homepage '] span[class='river-byline__authors']")
    private List<WebElement> articles;

    @FindBy(css = "header[class='post-block__header'] a[class='post-block__title__link']")
    private List<WebElement> first_article;

    public int getArticle() {
        int articleNumber = articles.size();
        return articleNumber;
    }

    public void clickFirstArticle() {
        click((By) first_article.get(1));
    }
}
