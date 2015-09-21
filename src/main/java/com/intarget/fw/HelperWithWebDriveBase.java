package com.intarget.fw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by landiz on 03.09.15.
 */
public class HelperWithWebDriveBase {


    private boolean acceptNextAlert = true;

    public ApplicationManager manager;
    public WebDriver driver;

    public HelperWithWebDriveBase(ApplicationManager manager){

        this.manager  = manager;
        driver = manager.getWebDriveHelper().getDriver();
    }


    public void typeById(String id, String email) {
        driver.findElement(By.id(id)).sendKeys(email);
    }

    public void clickById(String dLabel) {
        driver.findElement(By.id(dLabel)).click();
    }

    public void waitForElementPresent(By locator, int waitTime) {
        long start =  System.currentTimeMillis();
        while (System.currentTimeMillis() < start  + waitTime) {
            try { if (isElementPresent(locator)) return; } catch  (Exception e) {}
            try { Thread.sleep(500); } catch  (InterruptedException e) { throw new AssertionError(e); }
        }
        throw  new AssertionError("Element: "+locator+" not found");

    }

    public void waitForTextPresent(String text, int waitTime) {
        long start =  System.currentTimeMillis();
        while (System.currentTimeMillis() < start  + waitTime) {
            try { if (isTextPresent(text)) return; } catch  (Exception e) {}
            try { Thread.sleep(500); } catch  (InterruptedException e) { throw new AssertionError(e); }
        }
        throw  new AssertionError("Text: "+text+" not found");

    }

    public void assertTextPresent(String textPresent) {
        boolean w = isTextPresent(textPresent);
        Assert.assertEquals(true, w);
    }

    public void assertElementPresent(By elementPresent) {
        boolean w = isElementPresent(elementPresent);
        Assert.assertEquals(true, w);
    }

    public void assertTextNotPresent(String textPresent) {
        boolean e = isTextNotPresent(textPresent);
        Assert.assertEquals(false, e);
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getTextBycssSelector(String text) {
        return driver.findElement(By.cssSelector(text)).getText();
    }

    public String getTextByXpath(String text) {
        return driver.findElement(By.xpath(text)).getText();
    }

    public void selectTextByXpath(String text, int index) {
        driver.findElements(By.xpath(text)).get(index);
         }

    public void clickByLinkText(String text) {
        driver.findElement(By.linkText(text)).click();
    }

    public void clickByCssSelector(String selector) {
        driver.findElement(By.cssSelector(selector)).click();
    }

    public void clickByXpath(String location) {
        driver.findElement(By.xpath(location)).click();
    }

    public void typeByXpath(String locator, String name) {
        driver.findElement(By.xpath(locator)).clear();
        driver.findElement(By.xpath(locator)).sendKeys(name);
    }

    public void typeByCssSelector(String locator, String name) {
        driver.findElement(By.cssSelector(locator)).clear();
        driver.findElement(By.cssSelector(locator)).sendKeys(name);
    }

    public WebElement getElementByXpath(String xpathExpression, int index) {
        return driver.findElements(By.xpath(xpathExpression)).get(index);
    }

    public WebElement getElementByCssSelector(String locator, int index) {
        return driver.findElements(By.cssSelector(locator)).get(index);
    }


    public boolean isTextPresent(String text){
        try{
            boolean b = driver.getPageSource().contains(text);
            return b;
        }
        catch(Exception e){return false;}
    }

    protected boolean isTextNotPresent(String text){
        try{
            boolean b = driver.getPageSource().contains(text);
            return b;
        }
        catch(Exception e){
            return false;
        }
    }
    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    protected List<WebElement> findElements (By linkText){
        return  driver.findElements( linkText);
    }

    protected void openUrl(String string) {
        driver.get(string);
    }
}
