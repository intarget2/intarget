package com.intarget.fw;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


import java.net.URL;


public class WebDriverHelper {

    public WebDriver driver;
    private final ApplicationManager manager;

    public WebDriverHelper(ApplicationManager manager)  {

        this.manager = manager;
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://dev.intarget.ru/");
    }

    public void stop() {



        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString))
//            fail(verificationErrorString);

    }

    public WebDriver getDriver() {
        return driver;
    }
}
