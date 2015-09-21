package intarget.tests;

import com.intarget.fw.LoginObject;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test

    public void testValidLogin() throws Exception {

        LoginObject validLogin = new LoginObject("testintarget@mailinator.com", "test");

        app.getLoginHelper().login(validLogin);
    }
}
