package com.intarget.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TargetHelper extends HelperWithWebDriveBase{

    public TargetHelper(ApplicationManager manager){

        super(manager);

    }

    public Set<TargetObject> getTargets() {
        manager.getNavigationHelper().gotoTargetPage();

        List<WebElement> listargets = findElements(By.cssSelector("span[ng-bind='target.name']"));
        Set<TargetObject> targets = new HashSet<TargetObject>();
        for (WebElement listtargets: listargets){
            String name = listtargets.getText();
            TargetObject target = new TargetObject().setName(name) ;
            targets.add(target);
        }
        return targets;
    }

    public void createTarget(TargetObject targetObject) {

        manager.getNavigationHelper().gotoTargetPage();

        clickByLinkText("Добавить цель");

        typeByCssSelector("input[name='target_name']", targetObject.getName());

        typeByCssSelector("input[name='target_key']", targetObject.getUrl());
        Select selD = new Select(getElementByCssSelector("select[ng-model='target.targetCondition']", 0));

        selD.selectByVisibleText(targetObject.getCondition());

        clickByXpath("//input[@value='Сохранить']");
        clickByXpath("//li[3]/a/i");
        clickByCssSelector("i.utl-ico.utl-ico-target");
        clickByLinkText("Цели");
        waitForTextPresent(targetObject.getName(), 15000);
        Assert.assertTrue(isElementPresent(By.cssSelector("div.table-container")));
        Assert.assertTrue(isElementPresent(By.linkText("Импорт из Яндекс.Метрики")));
        Assert.assertTrue(isElementPresent(By.linkText("Добавить цель")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.text-center > a > i.utl-ico.utl-ico-gear")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.utl-ico.utl-ico-remove")));
//        waitForElementPresent(By.xpath("//div/span"), 60000);
     //   Assert.assertEquals("Образец воронки", getTextByXpath("//div/span"));
    //  Assert.assertEquals("Посетил главную", getTextBycssSelector("span.text.ng-binding"));
    }

    public void deleteTarget(TargetObject targetObject) {

        String name = targetObject.getName();

        String target = "//*[text()='"+ name + "']/../..//a[2]";

        clickByXpath(target);

        Assert.assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить цель[\\s\\S]$"));
        clickByXpath("//li[3]/a/i");
        clickByCssSelector("i.utl-ico.utl-ico-target");
        clickByLinkText("Цели");
    }
}
