package org.liberty.android.fantastischmemo.test.integration;

import org.liberty.android.fantastischmemo.test.TestHelper;
import org.liberty.android.fantastischmemo.ui.AnyMemo;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class AnyMemoActivityOpenTabTest extends ActivityInstrumentationTestCase2<AnyMemo> {

    protected AnyMemo mActivity;

    // Used for compatibility for Android 2.x
    @SuppressWarnings("deprecation")
    public AnyMemoActivityOpenTabTest() {
        super("org.liberty.android.fantastischmemo", AnyMemo.class);
    }

    private Solo solo;


    public void setUp() throws Exception{
        TestHelper uiTestHelper = new TestHelper(getInstrumentation());
        uiTestHelper.clearPreferences();
        uiTestHelper.markNotFirstTime();

        mActivity = this.getActivity();
        solo = new Solo(getInstrumentation(), mActivity);

        solo.sleep(1000);
        //solo.clickOnText(solo.getString(R.string.open_tab_text));

        solo.clickOnText("Download");
        solo.clickOnText("Misc");
    }


    public void testActionListStudy() {
    }


    public void tearDown() throws Exception {
        try {
            solo.finishOpenedActivities();
            solo.sleep(1000);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        super.tearDown();
    }

}
