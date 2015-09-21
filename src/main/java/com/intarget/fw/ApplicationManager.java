package com.intarget.fw;

import java.util.Properties;

public class ApplicationManager {



    private Properties props;

    private static ApplicationManager singleton;

    private WebDriverHelper webDriverHelper;
    private TargetHelper targetHelper;
    private NavigationHelper navigationHelper;
    private LoginHelper loginHelper;
    private FunnelHelper funnelHelper;
    private SegmentHelper segmentHelper;
    private WidgetHelper widgetHelper;
    private ProjectHelper projectHelper;

    public ApplicationManager() {

    }

    public static ApplicationManager    getInstance() {
        if (singleton == null){
            singleton = new ApplicationManager();
        }
        return singleton;
    }


    public String getProperty(String key) {
        return props.getProperty(key);
    }

    public void stop() {
        if (webDriverHelper != null) {
            webDriverHelper.stop();
        }
    }


    public TargetHelper getTargetHelper() {
        if (targetHelper == null) {
            targetHelper = new TargetHelper(this);
        }
        return targetHelper;
    }

    public NavigationHelper getNavigationHelper() {
        if (navigationHelper == null) {
            navigationHelper = new NavigationHelper(this);
        }
        return navigationHelper;
    }


    public WebDriverHelper getWebDriveHelper() {
        if (webDriverHelper == null) {
            webDriverHelper = new WebDriverHelper(this);
        }
        return webDriverHelper;
    }

    public LoginHelper getLoginHelper() {
        if (loginHelper == null) {
            loginHelper = new LoginHelper(this);
        }
        return loginHelper;

    }

    public FunnelHelper getFunnelHelper() {
        if (funnelHelper == null) {
            funnelHelper = new FunnelHelper(this);
        }
        return funnelHelper;
    }

    public SegmentHelper getSegmentHelper() {
        if (segmentHelper == null) {
            segmentHelper = new SegmentHelper(this);
        }
        return segmentHelper;
    }

    public WidgetHelper getWidgetHelper() {
        if (widgetHelper == null) {
            widgetHelper = new WidgetHelper(this);
        }
        return widgetHelper;
    }

    public ProjectHelper getProjectHelper() {
        if (projectHelper == null) {
            projectHelper = new ProjectHelper(this);
        }
        return projectHelper;
    }
}

