package stepDefinitions;

import com.selenium.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.GoogleHomePage;
import pageObject.GoogleSearchResultPage;
import testRunner.Hooks;

public class GoogleSearchSteps {

    WebDriver driver;

    public GoogleSearchSteps (){
        super();
        this.driver = Hooks.driver;
    }

    GoogleHomePage googleHomePage;

    @Given("^User visit google page$")
    public void userVisitGooglePage() {

        driver.navigate().to("https://www.google.com/webhp");
        System.out.println("Visitng google.com ....");
    }

    @When("^User input search keyword$")
    public void userInputSearchKeyword() {
        googleHomePage = new GoogleHomePage(driver);

        googleHomePage.inputKeyword("Sekolah QA");
        googleHomePage.enterKeyboard();
    }

    @When("^User input \"([^”]*)\" search$")
    public void userInputSearch(String keyword) {
        googleHomePage = new GoogleHomePage(driver);

        googleHomePage.inputKeyword(keyword);
        googleHomePage.enterKeyboard();
    }

    @When("^User input ([^”]*) in search field$")
    public void userInputSearchKeyword(String keyword) {
        googleHomePage = new GoogleHomePage(driver);

        googleHomePage.inputKeyword(keyword);
        googleHomePage.enterKeyboard();
    }

    @Then("^User should see search result$")
    public void verifTheResult() {
//        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(driver);
//        String resultTxt = googleSearchResultPage.getTextResult();
//        System.out.println(resultTxt);
        System.out.println("Verifying the result.....");

    }

}
