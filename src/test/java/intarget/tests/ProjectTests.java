package intarget.tests;

/**
 * Created by landiz on 05.09.15.
 */
public class ProjectTests extends TestBase{

    public void testProject() throws Exception {

        app.getProjectHelper().checkProjectCodePage();
        app.getProjectHelper().checkProjectTargetPage();
    }
}
