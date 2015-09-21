package com.intarget.fw;


import org.openqa.selenium.By;


public class LoginHelper extends HelperWithWebDriveBase{

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }


    public void login(LoginObject loginObject) {


//        assertElementPresent(By.xpath("//div[2]/a"));
//        assertElementPresent(By.xpath("//div[2]/div/div/div/div[2]"));

//        waitForElementPresent(By.id("dLabel"), 60000);
//        assertElementPresent(By.id("dLabel"));
        clickById("dLabel");
//        driver.findElement(By.id("dLabel")).click();
        waitForElementPresent(By.id("user-email"), 60000);
        typeById("user-email", loginObject.getEmail());
        typeById("user-password", loginObject.getPassword());

        clickByXpath("//input[@value='Войти']");
//        waitForElementPresent(By.id("user222-email"), 60000);
  waitForElementPresent(By.xpath("//a[contains(text(),'Добавить цель')]"), 60000);
    }
}