package intarget.tests;


import com.intarget.fw.TargetDataGenerator;
import com.intarget.fw.TargetObject;
import org.testng.annotations.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by landiz on 05.09.15.
 */
public class TargetTests extends TestBase {



    @Test (dataProvider = "randomTargets", dataProviderClass = TargetDataGenerator.class)

    public void testTarget(TargetObject validTarget) throws Exception {

       // TargetObject validTarget = new TargetObject("test цель", "testtarget.ru", "равен");

        Set<TargetObject> oldTargets = app.getTargetHelper().getTargets();

        app.getTargetHelper().createTarget(validTarget);

        Set<TargetObject> newTargets = app.getTargetHelper().getTargets();

        verifyTargetAdded(oldTargets, validTarget, newTargets);

        app.getTargetHelper().deleteTarget(validTarget);

    }

    private void verifyTargetAdded(Set<TargetObject> oldList, TargetObject validTarget, Set<TargetObject> newList) {

        assertThat(newList.size(), equalTo(oldList.size() + 1));



       // oldList.add(validTarget);
        //assertThat(newList, equalTo(oldList));

    }
}
