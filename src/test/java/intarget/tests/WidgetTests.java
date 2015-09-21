package intarget.tests;

import com.intarget.fw.WidgetObject;
import org.testng.annotations.Test;

public class WidgetTests extends TestBase{

    @Test

    public void testValidWidget() throws Exception {

        WidgetObject validWidget = new WidgetObject("test виджет");

        app.getWidgetHelper().checkWidgetsPage();
        app.getWidgetHelper().createWidget(validWidget);
        app.getWidgetHelper().checkWidgetStatistic();
        app.getWidgetHelper().deleteWidget(validWidget);

    }
}
