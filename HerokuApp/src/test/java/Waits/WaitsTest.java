package Waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTest extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.ClickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
