package intarget.tests;

import com.intarget.fw.FunnelObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by landiz on 05.09.15.
 */
public class FunnelTests extends TestBase{



   Random rnd = new Random();

    @DataProvider (name ="randomGroups")
    public Iterator<Object[]> generateRandomFunnels() {
        List<Object[]> list = new ArrayList<Object[]>();
        for (int i=0; i <5; i++){
            FunnelObject funnel = new FunnelObject().setName("name" + rnd.nextInt());
            list.add(new Object[] {funnel});
        }
        //new FunnelObject().setName("test воронка");

        return list.iterator();
    }

    @Test (dataProvider = "randomGroups")
    public void testValidFunnel(FunnelObject validFunnel) throws Exception {
        //TargetObject validTarget = new TargetObject().setName("tew");

//        LoginObject validLogin = new LoginObject("testintarget@mailinator.com", "test");
//        app.getLoginHelper().login(validLogin);


        app.getFunnelHelper().checkFunnelPage();

        Set<FunnelObject> oldFunnels = app.getFunnelHelper().getFunnels();
        //action
        //app.getFunnelHelper().createFunnel(validFunnel);
        //verification
        Set<FunnelObject> newFunnels = app. getFunnelHelper().getFunnels();

        //assertThat(newFunnels, equalTo(oldFunnels.withAdded(validFunnel)));

        verifyFunnelAdded(oldFunnels, validFunnel, newFunnels);

        app.getFunnelHelper().deleteFunnel(validFunnel);

    }

    private void verifyFunnelAdded(Set<FunnelObject> oldList, FunnelObject validFunnel, Set<FunnelObject> newList) {

        //assertThat(newList.size(), equalTo(oldList.size() + 1));

       //  validFunnel.setId("###");

            oldList.add(validFunnel);
            assertThat(newList, equalTo(oldList));

    }
}
