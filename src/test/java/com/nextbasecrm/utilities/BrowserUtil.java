package com.nextbasecrm.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtil {
    public static List<String> getElementText(List<WebElement> webElementList){
        //Create placeholder List<String>
        List<String> actualListAsString = new ArrayList<>();
        for (WebElement each : webElementList) {
            actualListAsString.add(each.getText());
        }
        return actualListAsString;
    }

    public static void assertTitle(String expectedTitle){

        //will throw TimeOut exception
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
