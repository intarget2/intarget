package com.intarget.fw;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by landiz on 05.09.15.
 */
public class ProjectHelper extends HelperWithWebDriveBase{

    public ProjectHelper (ApplicationManager manager){
        super(manager);
    }

    public void checkProjectTargetPage() {
        clickByLinkText("Цели");
        //driver.findElement(By.linkText("Цели")).click();
        waitForElementPresent(By.xpath("//td"), 60000);
        Assert.assertEquals("Цели", getTextBycssSelector("h2.pull-left"));
    }

    public void checkProjectCodePage() {
        clickByCssSelector("i.utl-ico.utl-ico-target");
        //driver.findElement(By.cssSelector("i.utl-ico.utl-ico-target")).click();
        waitForElementPresent(By.xpath("//pre"), 60000);
        Assert.assertTrue(isElementPresent(By.linkText("Код проекта")));
    }
}
