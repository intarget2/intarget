package com.intarget.fw;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by landiz on 05.09.15.
 */
public class SegmentHelper extends HelperWithWebDriveBase{

    public SegmentHelper(ApplicationManager manager) {
        super(manager);
    }

    public void checkSegmentsPage() {
        clickByXpath("//li[2]/a/i");
        Assert.assertTrue(isElementPresent(By.cssSelector("div.sub-menu.ng-isolate-scope")));
        Assert.assertTrue(isElementPresent(By.xpath("//div/div[2]/div[2]/div")));
        waitForElementPresent(By.xpath("//th[4]"), 60000);
        assertElementPresent(By.xpath("//div[2]/a"));
        assertElementPresent(By.xpath("//div[2]/div/a"));
        assertTextPresent("Новый сегмент");
        assertTextPresent("Фильтры");
        Assert.assertEquals("Возраст", getTextByXpath("//th[4]"));
        assertElementPresent(By.linkText("Обновить данные"));
    }

}
