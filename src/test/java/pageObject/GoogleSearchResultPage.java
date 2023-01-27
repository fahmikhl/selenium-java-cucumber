package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.selenium.base.BaseClass;

public class GoogleSearchResultPage extends BaseClass {

    public GoogleSearchResultPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[.='Sekolah QA Online 16+ Minggu dan Penyaluran Kerja']")
    private WebElement sekolahQAText;

    public String getTextResult(){
        String resultTxt = sekolahQAText.getText();
        return resultTxt;
    }


}
