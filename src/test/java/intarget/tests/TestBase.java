package intarget.tests;


import com.intarget.fw.ApplicationManager;
import com.intarget.fw.LoginObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

/**
 * Created by landiz on 02.09.15.
 */
public class TestBase {

    protected ApplicationManager app;


    private String baseUrl;


    @BeforeClass
    public void setUp() throws Exception {

        app = ApplicationManager.getInstance();
        //app = new ApplicationManager();


        baseUrl = "http://dev.intarget.ru/";

//        LoginObject validLogin = new LoginObject("testintarget@mailinator.com", "test");
//        app.getLoginHelper().login(validLogin);


    }

    @AfterTest
    public void tearDown() throws Exception {
        ApplicationManager.getInstance().stop();
    }

}
