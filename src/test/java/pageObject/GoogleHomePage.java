package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.selenium.base.BaseClass;

public class GoogleHomePage extends BaseClass {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //use @FindBy
    @FindBy(name = "q")
    private WebElement googleInput;

    //user By
    By googleInputBy = By.name("q");

    // How to call the element if use @FindBy
    public void inputKeyword (String keyword) {
    //  googleInput.sendKeys(keyword);
        super.input(googleInput, keyword);
    }

    //  How to call the element if use By
    public void inputKeywordBy (String keyword){
    //  driver.findElement(googleInputBy).sendKeys(keyword);
        super.input(driver.findElement(googleInputBy), keyword);
    }

    public void enterKeyboard(){
        googleInput.sendKeys(Keys.ENTER);
    }

}
