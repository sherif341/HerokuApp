package JS;

import base.BaseTests;
import org.testng.annotations.Test;

public class JSTest extends BaseTests {
    @Test
    public void testScrolling(){
        var landDPAge=homePage.clickLargeAndDeepDom();
        landDPAge.scrollToTable();
    }
}
