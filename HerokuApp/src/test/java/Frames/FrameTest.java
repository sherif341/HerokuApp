package Frames;

import base.BaseTests;
import org.testng.annotations.Test;

public class FrameTest extends BaseTests {
    @Test
    public void testWriteText(){
        var framePage=homePage.ClickingFramesPageLink();
        String t="Shery";
        framePage.clearText();
        framePage.writeText(t);
    }

}
