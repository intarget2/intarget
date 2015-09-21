package com.intarget.fw;

/**
 * Created by landiz on 04.09.15.
 */
public class TemporaryHelper {

//    public void smokeTest(LoginObject validLogin, TargetObject validTarget, FunnelObject validFunnel, WidgetObject validWidget) {
//        getNavigationHelper().openMainPage();
//        //login(validLogin);
//        checkFunnelPage();
//        createFunnel(validFunnel) ;
//        deleteFunnel(validFunnel);
//        checkSegmentsPage();
//        checkWidgetsPage();
//        createWidget(validWidget);
//        checkWidgetStatistic();
//        deleteWidget(validWidget);
//        checkProjectCodePage();
//        checkProjectTargetPage();
//        getTargetHelper().createTarget(validTarget);
////        targetHelper.createTarget(validTarget);
//      //  targetHelper.createTarget(validTarget);
//    //    targetHelper.getTargetHelper().deleteTarget(validTarget);
//
//        exit();
//    }



//    private void exit() {
//
//
//        clickByCssSelector("span.name");
//        clickByCssSelector("i.fa.fa-power-off");
//        waitForElementPresent(By.id("user-email"), 60000);
//        assertElementPresent(By.xpath("//div[2]/div/div/div/div[2]"));
//    }
//
//
//
//    private void checkProjectTargetPage() {
//        clickByLinkText("Цели");
//        //driver.findElement(By.linkText("Цели")).click();
//        waitForElementPresent(By.xpath("//td"), 60000);
//        Assert.assertEquals("Цели", driver.findElement(By.cssSelector("h2.pull-left")).getText());
//    }
//
//    private void checkProjectCodePage() {
//        clickByCssSelector("i.utl-ico.utl-ico-target");
//        //driver.findElement(By.cssSelector("i.utl-ico.utl-ico-target")).click();
//        waitForElementPresent(By.xpath("//pre"), 60000);
//        Assert.assertTrue(isElementPresent(By.linkText("Код проекта")));
//    }
//
//    private void deleteWidget(WidgetObject widgetObject) {
//        clickByXpath("//td[5]/a[2]/i");
//        //driver.findElement(By.xpath("//td[5]/a[2]/i")).click();
//        waitForTextPresent("Удалить", 15000);
//        clickByLinkText("Удалить");
//        //driver.findElement(By.linkText("Удалить")).click();
//        Assert.assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить виджет test виджет[\\s\\S]$"));
//        clickByCssSelector("i.utl-ico.utl-ico-target");
//        //driver.findElement(By.cssSelector("i.utl-ico.utl-ico-target")).click();
//        clickByXpath("//li[3]/a/i");
//        //driver.findElement(By.xpath("//li[3]/a/i")).click();
//        waitForTextPresent("Создан", 15000);
//        assertTextNotPresent(widgetObject.getName());
//    }
//
//    private void checkWidgetStatistic() {
//        clickByXpath("//td/a/span");
//        // driver.findElement(By.xpath("//td/a/span")).click();
//        waitForElementPresent(By.xpath("//div[3]/div[2]"), 60000);
//        waitForElementPresent(By.xpath("//th[3]"), 60000);
//        Assert.assertEquals("Статистика виджета", driver.findElement(By.xpath("//h2")).getText());
//        clickByLinkText("Вернуться к списку виджетов");
//        //driver.findElement(By.linkText("Вернуться к списку виджетов")).click();
//        waitForTextPresent("test виджет", 15000);
//    }
//
//    private void createWidget(WidgetObject widgetObject) {
//        clickByLinkText("Создать виджет");
//        waitForElementPresent(By.xpath("//div[2]/div[2]/div/div[2]/div"), 60000);
//        clickByXpath("//div[2]/div[2]/div/div[2]/div");
//        clickByLinkText("Далее");
//        typeByXpath("//div[3]/div/input", widgetObject.getName());
//        clickByXpath("//input[@value='Сохранить']");
//        waitForTextPresent("Оформление", 15000);
//        clickByLinkText("Вернуться к списку виджетов");
//        waitForElementPresent(By.xpath("//td[4]/div"), 60000);
//        waitForTextPresent(widgetObject.getName(), 15000);
//        Assert.assertEquals("Все посетители", driver.findElement(By.xpath("//td/span")).getText());
//        assertElementPresent(By.xpath("//td[4]/div"));
//    }
//
//    private void checkWidgetsPage() {
//        clickByXpath("//li[3]/a/i");
//        Assert.assertEquals("Виджеты", driver.findElement(By.cssSelector("h2")).getText());
//        Assert.assertTrue(isElementPresent(By.xpath("//div[2]/div/div[2]/div/div/div")));
//        Assert.assertTrue(isElementPresent(By.linkText("Создать виджет")));
//    }
//
//    private void checkSegmentsPage() {
//        clickByXpath("//li[2]/a/i");
//        Assert.assertTrue(isElementPresent(By.cssSelector("div.sub-menu.ng-isolate-scope")));
//        Assert.assertTrue(isElementPresent(By.xpath("//div/div[2]/div[2]/div")));
//        waitForElementPresent(By.xpath("//th[4]"), 60000);
//        assertElementPresent(By.xpath("//div[2]/a"));
//        assertElementPresent(By.xpath("//div[2]/div/a"));
//        assertTextPresent("Новый сегмент");
//        assertTextPresent("Фильтры");
//        Assert.assertEquals("Возраст", driver.findElement(By.xpath("//th[4]")).getText());
//        assertElementPresent(By.linkText("Обновить данные"));
//    }
//
//
}
