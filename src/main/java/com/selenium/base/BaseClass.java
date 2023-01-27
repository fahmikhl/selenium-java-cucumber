package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public static WebDriver driver;


    public BaseClass(WebDriver driver) {
        BaseClass.driver = driver;
    }

//    WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);

    //commons functions
    public void gotoURL (String url){
        driver.navigate().to(url);
    }

    public void tapElement (WebElement element){
//        if (!(element.isDisplayed())){
//            wait.until(ExpectedConditions.visibilityOf(element));
//        }
        element.click();
    }

    public void  input (WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

}
