package com.intarget.fw;


import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunnelHelper extends HelperWithWebDriveBase {

    public FunnelHelper(ApplicationManager manager) {
        super(manager);
    }

    public Set<FunnelObject> getFunnels() {
        manager.getNavigationHelper().gotoСonversionPage();

        List<WebElement> lisfunnels = findElements(By.cssSelector("span[ng-bind='funnel.name']"));
        Set<FunnelObject> funnels = new HashSet<FunnelObject>();
        for (WebElement listfunnels: lisfunnels){
            String name = listfunnels.getText();
            FunnelObject funnel = new FunnelObject().setName(name) ;
            funnels.add(funnel);
        }
        return funnels;
    }

    public void createFunnel(FunnelObject funnelObject, TargetObject validTarget) {
        manager.getNavigationHelper().gotoFunnelPage();

        clickByXpath("//div[2]/div/div/div/div/a/span");
        clickByLinkText("Добавить существующую цель");
        Select selDr = new Select(getElementByXpath("//html/body/div[4]/div/div/form/div[2]/div[2]/div/div/div[2]/div/div/div[2]/select", 0));  //выбор селекта

        //TargetObject target = manager.getTargetHelper()
        //selDr.selectByVisibleText();
        String target = validTarget.getName();

        selDr.selectByVisibleText(target);
        typeByXpath("//input[@name='funnelName']", funnelObject.getName());
        clickByXpath("//input[@value='Сохранить']");
        waitForTextPresent(funnelObject.getName(), 10000);
    }

    public void deleteFunnel(FunnelObject funnelObject) {
        manager.getNavigationHelper().gotoFunnelPage();
        clickByLinkText(funnelObject.getName());
        clickByXpath("//span/i");
        waitForElementPresent(By.linkText("Удалить воронку"), 60000);
        clickByLinkText("Удалить воронку");
        clickByXpath("//li[2]/a/i");
        clickByXpath("//nav/ul/li/a/i");
        waitForElementPresent(By.xpath("//a[contains(text (),'Добавить цель')]"), 60000);
        assertTextNotPresent(funnelObject.getName());
    }

    public void checkFunnelPage() {

        manager.getNavigationHelper().gotoFunnelPage();

        waitForElementPresent(By.xpath("//a[contains(text(),'Добавить цель')]"), 60000);
        Assert.assertTrue(isElementPresent(By.cssSelector("i.utl-ico.utl-ico-gear")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.utl-ico.utl-ico-plus-o")));
        assertElementPresent(By.xpath("//div[3]/div[2]/div"));
        assertElementPresent(By.xpath("//div[3]/div[2]/div[2]"));
        assertElementPresent(By.xpath("//div[2]/div[3]"));
        assertElementPresent(By.xpath("//div[2]/div[4]"));
        assertElementPresent(By.xpath("//div/div[2]/div/div/div[2]/div/div/div[2]"));
        waitForTextPresent("Источники трафика", 5000);
        assertTextPresent("Конверсии");
        assertTextPresent("Новая воронка");
        Assert.assertTrue(isElementPresent(By.cssSelector("h2.pull-left > span.ng-binding")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.relative > div.row > div.col-xs-16")));
        Assert.assertTrue(isElementPresent(By.xpath("//div[2]/div[4]/div")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.sub-menu.ng-isolate-scope")));
        Assert.assertEquals("Ваши воронки", getTextBycssSelector("h4"));
    }


}



