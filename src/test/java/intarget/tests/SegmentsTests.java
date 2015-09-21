package intarget.tests;

import org.testng.annotations.Test;

/**
 * Created by landiz on 05.09.15.
 */
public class SegmentsTests extends TestBase{

    @Test

    public void checkSegmentsPage() throws Exception {

        app.getSegmentHelper().checkSegmentsPage();
    }
}
