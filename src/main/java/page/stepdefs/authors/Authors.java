package page.stepdefs.authors;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.base.articles.Articles;

public class Authors {

    private Articles articles;

    @Then("I should see text as cart title")
    public void getCartTitleText(String cartTitleText){
        Assert.assertEquals("abcd",articles.getArticle());
    }

    @When("I close Cart screen from x button on cart screen")
    public void clickCloseCartScreenButton(){articles.clickFirstArticle();}
}
