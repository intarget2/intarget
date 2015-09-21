package intarget.tests;

import com.intarget.fw.FunnelObject;
import com.intarget.fw.LoginObject;
import com.intarget.fw.TargetObject;
import com.intarget.fw.WidgetObject;
import org.testng.annotations.Test;

public class SmokeIntargetTests extends TestBase{

    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void testCheck() throws Exception {

        LoginObject validLogin = new LoginObject("testintarget@mailinator.com", "test");
        //TargetObject validTarget = new TargetObject("test цель", "testtarget.ru", "равен");
        TargetObject validTarget = new TargetObject().setName("name" ).setUrl("testtarget.ru").setCondition("равен");
        FunnelObject validFunnel = new FunnelObject().setName("test воронка");
        WidgetObject validWidget = new WidgetObject("test виджет");

//        app.getLoginHelper().login(validLogin);

        app.getTargetHelper().createTarget(validTarget);



        app.getFunnelHelper().checkFunnelPage();

        app.getFunnelHelper().createFunnel(validFunnel, validTarget);


        app.getFunnelHelper().deleteFunnel(validFunnel);

       // app.getSegmentHelper().checkSegmentsPage();


        app.getWidgetHelper().createWidget(validWidget);

        app.getWidgetHelper().checkWidgetsPage();
        app.getWidgetHelper().checkWidgetStatistic();
        app.getWidgetHelper().deleteWidget(validWidget);

      //  app.getProjectHelper().checkProjectCodePage();
      //  app.getProjectHelper().checkProjectTargetPage();

//        app.getTargetHelper().createTarget(validTarget);
       app.getTargetHelper().deleteTarget(validTarget);

        app.getNavigationHelper().exit();

    }

}
