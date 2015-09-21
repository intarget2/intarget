package com.intarget.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperWithWebDriveBase{

    public String baseUrl = "https://intarget.ru";

    public NavigationHelper (ApplicationManager manager){
        super(manager);
    }



    public void openMainPage() {
        //if()
        //ToDo

        openUrl("http://intarget.ru/");
    }

    public void exit() {

        clickByCssSelector("span.name");
        clickByCssSelector("i.fa.fa-power-off");
        waitForElementPresent(By.id("user-email"), 60000);
        assertElementPresent(By.xpath("//div[2]/div/div/div/div[2]"));
    }

    public void gotoСonversionPage() {
        clickByXpath("//nav/ul/li/a/i");
    }

    public void gotoTargetPage() {
        //String baseUrl = "https://intarget.ru";
        //openUrl("http://dev.intarget.ru/#/cabinet/project/targets");

        //driver.findElement(By.cssSelector("li.active > a > span.text")).click();
        //driver.findElement(By.cssSelector("i.utl-ico.utl-ico-target")).click();
        openUrl("http://dev.intarget.ru/#/cabinet/project/code");
        driver.findElement(By.linkText("Цели")).click();

    }

    public void gotoFunnelPage() {
        clickByXpath("//nav/ul/li/a/i");
    }
}
