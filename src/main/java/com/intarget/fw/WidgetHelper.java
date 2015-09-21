package com.intarget.fw;

import org.openqa.selenium.By;
import org.testng.Assert;

public class WidgetHelper extends HelperWithWebDriveBase{

    public WidgetHelper(ApplicationManager manager) {
        super(manager);
    }

    public void deleteWidget(WidgetObject widgetObject) {
        clickByXpath("//td[5]/a[2]/i");
        waitForTextPresent("Удалить", 15000);
        clickByLinkText("Удалить");
        Assert.assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить виджет test виджет[\\s\\S]$"));
        clickByCssSelector("i.utl-ico.utl-ico-target");
        clickByXpath("//li[3]/a/i");
        waitForTextPresent("Создан", 15000);
        assertTextNotPresent(widgetObject.getName());
    }

    public void checkWidgetStatistic() {
        clickByXpath("//td/a/span");
        waitForElementPresent(By.xpath("//div[3]/div[2]"), 60000);
        waitForElementPresent(By.xpath("//th[3]"), 60000);
        Assert.assertEquals("Статистика виджета", getTextByXpath("//h2"));
        clickByLinkText("Вернуться к списку виджетов");
        waitForTextPresent("test виджет", 15000);
    }

    public void createWidget(WidgetObject widgetObject) {
        clickByLinkText("Создать виджет");
        waitForElementPresent(By.xpath("//div[2]/div[2]/div/div[2]/div"), 60000);
        clickByXpath("//div[2]/div[2]/div/div[2]/div");
        clickByLinkText("Далее");
        typeByXpath("//div[3]/div/input", widgetObject.getName());
        clickByXpath("//input[@value='Сохранить']");
        waitForTextPresent("Оформление", 15000);
        clickByLinkText("Вернуться к списку виджетов");
        waitForElementPresent(By.xpath("//td[4]/div"), 60000);
        waitForTextPresent(widgetObject.getName(), 15000);
        Assert.assertEquals("Все посетители", getTextByXpath("//td/span"));
        assertElementPresent(By.xpath("//td[4]/div"));
    }

    public void checkWidgetsPage() {
        clickByXpath("//li[3]/a/i");
        Assert.assertEquals("Виджеты", getTextBycssSelector("h2"));
        Assert.assertTrue(isElementPresent(By.xpath("//div[2]/div/div[2]/div/div/div")));
        Assert.assertTrue(isElementPresent(By.linkText("Создать виджет")));
    }

}

